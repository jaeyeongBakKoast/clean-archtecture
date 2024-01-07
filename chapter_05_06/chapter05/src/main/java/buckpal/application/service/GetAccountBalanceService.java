package buckpal.application.service;

import buckpal.application.port.in.GetAccountBalanceQuery;
import buckpal.application.port.out.LoadAccountPort;
import buckpal.domain.Account.AccountId;
import buckpal.domain.Money;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

	private final LoadAccountPort loadAccountPort;

	@Override
	public Money getAccountBalance(AccountId accountId) {
		return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
				.calculateBalance();
	}
}

package buckpal.application.port.in;


import buckpal.domain.Account.AccountId;
import buckpal.domain.Money;

public interface GetAccountBalanceQuery {

	Money getAccountBalance(AccountId accountId);

}

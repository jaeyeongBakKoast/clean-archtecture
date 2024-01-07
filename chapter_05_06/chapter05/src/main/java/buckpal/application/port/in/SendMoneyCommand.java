package buckpal.application.port.in;

import buckpal.domain.Money;
import lombok.Getter;
import buckpal.domain.Account.AccountId;
import shared.SelfValidating;

import javax.validation.constraints.NotNull;

@Getter
public
class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

    @NotNull
    private final AccountId sourceAccountId;

    @NotNull
    private final AccountId targetAccountId;

    @NotNull
    private final Money money;

    public SendMoneyCommand(
            AccountId sourceAccountId,
            AccountId targetAccountId,
            Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        this.validateSelf();
    }
}

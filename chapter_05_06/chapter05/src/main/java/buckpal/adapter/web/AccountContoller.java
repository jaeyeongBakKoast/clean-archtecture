//package buckpal.adapter.web;
//
//import buckpal.application.port.in.GetAccountBalanceQuery;
//import buckpal.application.port.in.SendMoneyUseCase;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//public class AccountContoller {
//    private final GetAccountBalanceQuery getAccountBalanceQuery;
//    private final ListAccountsQuery listAccountsQuery;
//    private final LoadAccountQuery loadAccountQuery;
//
//    private final SendMoneyUseCase sendMoneyUseCase;
//    private final CreateAccountUseCase createAccountUseCase;
//
//    @GetMapping("/accounts")
//    List<AccountResource> listAccounts() {
//
//    }
//
//    @GetMapping("/accounts/{accountId}")
//    AccountResource getAccount(@PathVariable("accountId") Long accountId) {
//
//    }
//
//    @GetMapping("/accounts/{accountId}/balance")
//    long getAccountBalance(@PathVariable("accountId") Long accountId) {
//
//    }
//
//    @PostMapping("/accounts")
//    AccountResource createAccount(@RequestBody AccountResource account) {
//
//    }
//
//    @PostMapping("/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
//    void sendMoney(
//            @PathVariable("sourceAccountId") Long sourceAccountId,
//            @PathVariable("targetAccountId") Long targetAccountId,
//            @PathVariable("amount") Long amount) {
//
//    }
//
//}

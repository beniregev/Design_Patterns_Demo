package com.beniregev.designpatterns.structural_patterns.facade;

/**
 * <div>
 *     <p>
 *         When you create a simplified interface that performs many
 *         other actions behind the scenes.
 *         <ul>
 *             Can I withdraw 50 USD from the bank?
 *             <li>Check: is the account correct?</li>
 *             <li>Check: is the account valid?</li>
 *             <li>Check: is the security code correct?</li>
 *             <li>Check: is the security code valid?</li>
 *             <li>Check: is the account balance enough?</li>
 *             <li>Make changes accordingly.</li>
 *             <li></li>
 *         </ul>
 *     </p>
 *     <p>
 *         Welcome to may Facade Design Pattern Example! The Facade
 *         pattern is extremely easy to understand. Chances are you
 *         have used it already and just didn't know it.
 *     </p>
 *     <p>
 *         The Facade pattern basically says that you should
 *         simplify your methods so that much of what is done is
 *         in the background. In technical terms you should decouple
 *         the client from the sub components needed to perform an
 *         operation.
 *     </p>
 *     <p>
 *         All of the code that follows the video will fill you in on
 *         anything you don’t catch in the video.
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(990.00);
        accessingBank.depositCash(200.00);
    }
}

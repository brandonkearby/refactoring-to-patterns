package refactorings.replaceConditionalDispatcherWithCommand.handlers;

import refactorings.replaceConditionalDispatcherWithCommand.Account;
import refactorings.replaceConditionalDispatcherWithCommand.Message;

import java.util.Date;
import java.util.List;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public interface Collector {

    List<Message> getMessages(Date startDate, Date endDate);

    List<Account> getAccounts();

    List<Account> getFollowers(Account account);

    Long getFollowerCount();
}

package refactorings.replaceConditionalDispatcherWithCommand.handlers;

import refactorings.replaceConditionalDispatcherWithCommand.Account;
import refactorings.replaceConditionalDispatcherWithCommand.Message;

import java.util.Date;
import java.util.List;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class FacebookCollector implements Collector {

    @Override
    public List<Message> getMessages(Date startDate, Date endDate) {
        return null;
    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }

    @Override
    public List<Account> getFollowers(Account account) {
        return null;
    }

    @Override
    public Long getFollowerCount() {
        return 0L;
    }
}

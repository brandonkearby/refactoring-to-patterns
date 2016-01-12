package refactorings.replaceConditionalDispatcherWithCommand;

import refactorings.replaceConditionalDispatcherWithCommand.handlers.Collector;
import refactorings.replaceConditionalDispatcherWithCommand.handlers.FacebookCollector;

import java.util.*;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public class SocialNetworkCollectorService {
    public enum SocialNetwork {
        FACEBOOK,
        TWITTER,
        YOUTUBE,
        LINKEDIN
    }

    private Map<SocialNetwork, Collector> registry;
    public SocialNetworkCollectorService() {
           registry = new HashMap<SocialNetwork, Collector>();
        registry.put(SocialNetwork.FACEBOOK, new FacebookCollector());
    }

    public Collector getCollector(SocialNetwork socialNetwork) {
        return registry.get(socialNetwork);
    }


}

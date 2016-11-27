package comswatisingh0960.httpsgithub.restaurantmap.APIs;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

/**
 * Created by Swati on 11/25/2016.
 */

/**
        * Generic service provider for two-step OAuth10a.
        */
public class TwoStepOAuth extends DefaultApi10a {

    @Override
    public String getAccessTokenEndpoint() { return null; }

    @Override
    public String getAuthorizationUrl(Token unused) {
        return null;
    }

    @Override
    public String getRequestTokenEndpoint() {
        return null;
    }
}

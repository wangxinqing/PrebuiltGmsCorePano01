package defpackage;

/* renamed from: ayoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayoe implements ayod {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.octarine")).a("gms:octarine:");
        agvx.a(a2, "Config__accountChooserUrl", "https://accounts.google.com/AccountChooser");
        agvx.a(a2, "Config__browser_auth_blacklist_regex", "https://(www\\.google\\.com/inputtools(/.*)?|www\\.google\\.com/url|support\\.google\\.com(/.*)?|accounts\\.google\\.com/Logout|myaccount\\.google\\.com/accountdeleted|myaccount\\.google\\.com/agedisabled|userresearch\\.google\\.com)");
        agvx.a(a2, "Config__browser_auth_whitelist_regex", "https://[a-zA-Z0-9.-]+\\.google\\.com(/.*)?");
        agvx.a(a2, "Config__enable_play_protect_js_bridge", true);
        a = agvx.a(a2, "Config__enable_security_key_support", true);
        b = agvx.a(a2, "Config__enable_telephony_js_bridge", true);
        c = agvx.a(a2, "Config__enable_trust_agent_support", true);
        agvx.a(a2, "Config__enforce_auth_cookie_refresh", false);
        agvx.a(a2, "Config__js_bridge_blacklist_regex", "");
        agvx.a(a2, "Config__js_bridge_whitelist_regex", "https://(myaccount\\.google\\.com/embedded/.*|myactivity\\.google\\.com/embedded/.*|adssettings\\.google\\.com/embedded/.*|passwords\\.google\\.com/embedded/.*|takeout\\.google\\.com/embedded/.*|accounts\\.google\\.com/.*)");
        agvx.a(a2, "Config__login_cookie_hashing_improvement_enabled", true);
        agvx.a(a2, "Config__security_key_js_bridge_blacklist_regex", "");
        agvx.a(a2, "Config__security_key_js_bridge_whitelist_regex", "https://accounts\\.google\\.com/ServiceLogin.*");
        agvx.a(a2, "Config__telephony_js_bridge_blacklist_regex", "");
        agvx.a(a2, "Config__telephony_js_bridge_whitelist_regex", "https://myaccount\\.google\\.com/embedded/signinoptions/recovery-options-collection");
        agvx.a(a2, "Config__url_blacklist_regex", "");
        agvx.a(a2, "Config__url_whitelist_regex", "https://(myaccount\\.google\\.com/embedded/.*|myaccount\\.google\\.com/accounts/SetOSID|myactivity\\.google\\.com/embedded/.*|adssettings\\.google\\.com/embedded/.*|fit\\.google\\.com/privacy/embedded/.*|takeout\\.google\\.com/embedded/.*|passwords\\.google\\.com/embedded/.*|passwords\\.google\\.com/accounts/SetOSID|accounts\\.g\\.(cn)(/.*)?|accounts\\.googel\\.(cn)(/.*)?|accounts\\.google\\.(ac|ad|ae|af|ag|al|am|as|at|aw|az|ba|be|bf|bg|bi|biz|bj|bm|bn|bo|bs|bt|by|bz|ca|cat|cc|cd|cf|cg|ch|ci|cl|cm|cn|co\\.ao|co\\.at|co\\.ba|co\\.bi|co\\.bw|co\\.ci|co\\.ck|co\\.cr|co\\.gg|co\\.gl|co\\.gy|co\\.hu|co\\.id|co\\.il|co\\.im|co\\.in|co\\.it|co\\.je|co\\.jp|co\\.ke|co\\.kr|co\\.ls|co\\.ma|co\\.mu|co\\.mw|co\\.mz|co\\.nz|co\\.pn|co\\.rs|co\\.th|co\\.tt|co\\.tz|co\\.ua|co\\.ug|co\\.uk|co\\.uz|co\\.ve|co\\.vi|co\\.za|co\\.zm|co\\.zw|com|com\\.af|com\\.ag|com\\.ai|com\\.ar|com\\.au|com\\.az|com\\.bd|com\\.bh|com\\.bi|com\\.bn|com\\.bo|com\\.br|com\\.bs|com\\.by|com\\.bz|com\\.cn|com\\.co|com\\.cu|com\\.cy|com\\.do|com\\.dz|com\\.ec|com\\.eg|com\\.er|com\\.et|com\\.fj|com\\.ge|com\\.gh|com\\.gi|com\\.gl|com\\.gp|com\\.gr|com\\.gt|com\\.gy|com\\.hk|com\\.hn|com\\.hr|com\\.ht|com\\.iq|com\\.jm|com\\.jo|com\\.kg|com\\.kh|com\\.ki|com\\.kw|com\\.kz|com\\.lb|com\\.lc|com\\.lk|com\\.lv|com\\.ly|com\\.mk|com\\.mm|com\\.mt|com\\.mu|com\\.mw|com\\.mx|com\\.my|com\\.na|com\\.nc|com\\.nf|com\\.ng|com\\.ni|com\\.np|com\\.nr|com\\.om|com\\.pa|com\\.pe|com\\.pg|com\\.ph|com\\.pk|com\\.pl|com\\.pr|com\\.ps|com\\.pt|com\\.py|com\\.qa|com\\.ru|com\\.sa|com\\.sb|com\\.sc|com\\.sg|com\\.sl|com\\.sv|com\\.tj|com\\.tm|com\\.tn|com\\.tr|com\\.tt|com\\.tw|com\\.ua|com\\.uy|com\\.uz|com\\.vc|com\\.ve|com\\.vi|com\\.vn|com\\.ws|cv|cx|cz|de|dj|dk|dm|do|dz|ec|ee|es|eu|fi|fm|fr|ga|gd|ge|gf|gg|gl|gm|gp|gr|gw|gy|hk|hn|hr|ht|hu|ie|im|in|in\\.rs|info|io|iq|is|it|it\\.ao|je|jo|jobs|jp|kg|ki|km|kn|kr|kz|la|li|lk|lt|lu|lv|ma|md|me|mg|mh|mk|ml|mn|mobi|mr|ms|mu|mv|mw|mx|name|ne|ne\\.jp|net|net\\.in|net\\.nz|nf|ng|nl|no|nom\\.es|nr|nu|off\\.ai|org|org\\.af|org\\.es|org\\.in|org\\.nz|org\\.uk|pf|ph|pk|pl|pn|pr|pro|ps|pt|qa|re|ro|rs|ru|rw|sc|se|sg|sh|si|sk|sl|sm|sn|so|sr|st|sz|td|tel|tg|tk|tl|tm|tn|to|tp|tt|tv|tw|ua|ug|us|uz|vc|vg|vn|vu|ws|yt)(/.*)?|accounts\\.guge\\.(cn|com|com\\.cn)(/.*)?|accounts\\.xn--2e0b0k\\.(kr)(/.*)?|accounts\\.xn--c1aay4a\\.(xn--p1ai)(/.*)?|accounts\\.xn--flW351E\\.(cn)(/.*)?|accounts\\.youtube\\.(com)(/.*)?)");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}

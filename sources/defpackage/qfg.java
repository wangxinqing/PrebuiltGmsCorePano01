package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: qfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfg extends jjb {
    private static final String[] j = {"Holdback", "Can't retry optin", "No eligible account", "User prefers browser", "Unsupported OS", "Unavailable runtime", "No AppInfo", "No route", "Installed app present", "Resolved Launch", "Resolved Opt-in", "Resolved Install", "Resolved Delegate", "Hash prefix w/at least filter matches: %d w/o at least filter match: %d", "LevelDB Error", "No domain filter", "Hash prefixes unsynced", "Resolved DevMan launch", "No DevMan AppInfo", "Network disallowed"};
    private static SimpleDateFormat k = null;

    public qfg() {
        super(20);
    }

    /* access modifiers changed from: protected */
    public final String a(long j2, int i, int i2) {
        String str;
        if (k == null) {
            k = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.US);
        }
        SimpleDateFormat simpleDateFormat = k;
        if (i != 13) {
            str = j[i];
        } else {
            str = String.format(Locale.US, j[i], new Object[]{Integer.valueOf(i2 & 15), Integer.valueOf((i2 & 240) >> 4)});
        }
        String format = simpleDateFormat.format(new Date(j2));
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2 + String.valueOf(str).length());
        sb.append(format);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    public final void b(int i, int i2) {
        a(13, (i & 15) | ((i2 & 15) << 4));
    }
}

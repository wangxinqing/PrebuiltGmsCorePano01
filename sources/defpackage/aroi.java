package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: aroi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aroi extends jjb {
    private final SimpleDateFormat j = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.US);

    public aroi() {
        super(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
    }

    /* access modifiers changed from: protected */
    public final String a(long j2, int i, int i2) {
        String str;
        Date date = new Date(j2);
        Object[] objArr = new Object[3];
        objArr[0] = this.j.format(date);
        if (i != 1025) {
            switch (i) {
                case 0:
                    str = "EVT_APP_FROM_HOST";
                    break;
                case 1:
                    str = "CONTEXT_HUB_APPS_ENABLE";
                    break;
                case 2:
                    str = "CONTEXT_HUB_APPS_DISABLE";
                    break;
                case 3:
                    str = "CONTEXT_HUB_LOAD_APP";
                    break;
                case 4:
                    str = "CONTEXT_HUB_UNLOAD_APP";
                    break;
                case 5:
                    str = "CONTEXT_HUB_QUERY_APPS";
                    break;
                case 6:
                    str = "CONTEXT_HUB_QUERY_MEMORY";
                    break;
                case 7:
                    str = "CONTEXT_HUB_OS_REBOOT";
                    break;
                default:
                    StringBuilder sb = new StringBuilder(21);
                    sb.append("<Unknown:");
                    sb.append(i);
                    sb.append('>');
                    str = sb.toString();
                    break;
            }
        } else {
            str = "EVT_APP_TO_HOST";
        }
        objArr[1] = str;
        objArr[2] = Integer.valueOf(i2);
        return String.format("    %s %s (NanoAppUid: %s)", objArr);
    }
}

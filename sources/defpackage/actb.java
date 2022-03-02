package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.regex.Pattern;

/* renamed from: actb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actb {
    public static final String a;
    public static final String b;
    public static final int c;
    public static final Pattern p = Pattern.compile("\\?<([a-zA-Z0-9]+)>");
    public final acsz d = new acta((String) acsu.a.c());
    public final acsz e = new acta((String) acsu.b.c());
    public final acsz f = new acta((String) acsu.c.c());
    public final acsz g = new acta((String) acsu.d.c());
    public final acsz h = new acsz((String) acsu.e.c());
    public final acsz i = new acsz((String) acsu.f.c());
    public final acsz j = new acsz((String) acsu.g.c());
    public final acsz k = new acsz((String) acsu.h.c());
    public final acsz l = new acsz((String) acsu.i.c());
    public final acsz m = new acsz((String) acsu.j.c());
    public final acsz n = new acsz((String) acsu.k.c());
    public final int o = ((Integer) acsu.l.c()).intValue();
    private final int q = ((Integer) acsu.m.c()).intValue();

    static {
        String str;
        String str2;
        int i2;
        if (!jkr.a()) {
            str = "\\[(?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^]]*\\]";
        } else {
            str = "[\\[{](?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^\\]}]*[\\]}]";
        }
        a = str;
        if (!jkr.a()) {
            str2 = " *bucketStart=(?<start>[0-9]+)(?: activeTime=(?<active>[0-9]+))?(?: rxBytes=(?<rxBytes>[0-9]+))?(?: rxPackets=(?<rxPackets>[0-9]+))?(?: txBytes=(?<txBytes>[0-9]+))?(?: txPackets=(?<txPackets>[0-9]+))?(?: operations=(?<operations>[0-9]+))?.*";
        } else {
            str2 = " *st=(?<start>[0-9]+)(?: rb=(?<rxBytes>[0-9]+))?(?: rp=(?<rxPackets>[0-9]+))?(?: tb=(?<txBytes>[0-9]+))?(?: tp=(?<txPackets>[0-9]+))?(?: op=(?<operations>[0-9]+))?.*";
        }
        b = str2;
        if (!jkr.a()) {
            i2 = 1;
        } else {
            i2 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        }
        c = i2;
    }

    public final long a(long j2) {
        return j2 * ((long) this.q);
    }
}

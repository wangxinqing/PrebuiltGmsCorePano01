package defpackage;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajgg {
    private final List a = new ArrayList();
    private final boolean b;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public ajgg(String str, boolean z) {
        this.b = z;
        for (String trim : amsk.a(';').a((CharSequence) str)) {
            String trim2 = trim.trim();
            if (!trim2.isEmpty()) {
                List c = amsk.a(',').c(trim2);
                if (c.size() == 4) {
                    this.a.add(new ajgf(Integer.parseInt((String) c.get(0)), Double.parseDouble((String) c.get(1)), Double.parseDouble((String) c.get(2)), Double.parseDouble((String) c.get(3))));
                }
            }
        }
    }

    private static final long b(Location location, long j) {
        return aema.a(aema.a(location.getLatitude(), location.getLongitude()), (int) j);
    }

    public final ajge a(Location location, long j) {
        int i = 0;
        if (this.b) {
            return new ajge(true, 0, b(location, j));
        }
        this.a.size();
        List list = this.a;
        int size = list.size();
        while (i < size) {
            ajgf ajgf = (ajgf) list.get(i);
            Location location2 = ajgf.b;
            double d = ajgf.c;
            float distanceTo = location2.distanceTo(location);
            double d2 = ajgf.c;
            ajgf.b.getLatitude();
            ajgf.b.getLongitude();
            i++;
            if (((double) distanceTo) <= d2) {
                return new ajge(true, ajgf.a, b(location, j));
            }
        }
        return ajge.a;
    }
}

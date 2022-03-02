package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: afgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgp {
    public static final /* synthetic */ int h = 0;
    private static final EnumMap i;
    public final awdn a;
    public final Object b = new Object();
    public afgo c = afgo.NO_RESULT;
    public volatile aorr d = null;
    public int e = 0;
    public final AtomicLong f = new AtomicLong(0);
    public final List g = new ArrayList();
    private long j = -1;

    static {
        EnumMap enumMap = new EnumMap(afgo.class);
        i = enumMap;
        enumMap.put(afgo.NO_RESULT, EnumSet.of(afgo.PENDING_FIRST_GOOD));
        i.put(afgo.PENDING_FIRST_GOOD, EnumSet.of(afgo.BAD_RESULT, afgo.GOOD_RESULT));
        i.put(afgo.BAD_RESULT, EnumSet.of(afgo.PENDING_FIRST_GOOD));
        i.put(afgo.GOOD_RESULT, EnumSet.noneOf(afgo.class));
    }

    public afgp(awdn awdn) {
        this.a = awdn;
    }

    public final void a(afgo afgo) {
        amrl.a(((EnumSet) i.get(this.c)).contains(afgo), "Cannot transition from %s to %s", (Object) this.c, (Object) afgo);
        this.c = afgo;
    }

    public final void a(aorr aorr) {
        synchronized (this.b) {
            afgo afgo = afgo.NO_RESULT;
            int ordinal = this.c.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                this.d = aosh.f();
                a(afgo.PENDING_FIRST_GOOD);
            }
            this.e++;
            try {
                this.c.a(this);
            } catch (Throwable th) {
                this.e--;
                throw th;
            }
        }
        aorr.a(new afgn(this, aorr), aoqm.a);
    }

    public final boolean a(Object obj, long j2) {
        if (j2 <= this.j) {
            return false;
        }
        this.d = aorl.a(obj);
        this.j = j2;
        return true;
    }
}

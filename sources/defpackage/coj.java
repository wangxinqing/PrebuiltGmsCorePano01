package defpackage;

/* renamed from: coj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class coj {
    static final coj a;

    static {
        coi coi = new coi();
        coi.a = 10485760L;
        coi.b = 200;
        coi.c = 10000;
        coi.d = 604800000L;
        String str = coi.a == null ? " maxStorageSizeInBytes" : "";
        if (coi.b == null) {
            str = str.concat(" loadBatchSize");
        }
        if (coi.c == null) {
            str = String.valueOf(str).concat(" criticalSectionEnterTimeoutMs");
        }
        if (coi.d == null) {
            str = String.valueOf(str).concat(" eventCleanUpAge");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        } else {
            a = new cof(coi.a.longValue(), coi.b.intValue(), coi.c.intValue(), coi.d.longValue());
        }
    }

    public abstract long a();

    public abstract int b();

    public abstract int c();

    public abstract long d();
}

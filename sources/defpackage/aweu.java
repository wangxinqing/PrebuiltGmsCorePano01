package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aweu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aweu {
    private static final amqy a = new awer();
    private static final aoqb b = new awes();

    static {
        new aweg(aorl.a((Object) anfu.b));
    }

    public static aorr a(aorr aorr) {
        return aooz.a(aopr.a(aorr, a, (Executor) aoqm.a), Throwable.class, b, (Executor) aoqm.a);
    }

    public static awef a(awef awef) {
        if (awef instanceof awen) {
            return ((awen) awef).aZ();
        }
        String valueOf = String.valueOf(awef);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
        sb.append("nonCancellationPropagatingViewOf called with non-CancellableProducer: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [awen, awef, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.awef a(defpackage.awef r2, defpackage.aweo r3) {
        /*
            boolean r0 = r2 instanceof defpackage.awen
            if (r0 == 0) goto L_0x0009
            awef r2 = r2.a((defpackage.aweo) r3)
            return r2
        L_0x0009:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 54
            r1.<init>(r0)
            java.lang.String r0 = "entryPointViewOf called with non-CancellableProducer: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aweu.a(awef, aweo):awef");
    }

    public static awef a(bapu bapu) {
        amrl.a((Object) bapu);
        return new awet(bapu);
    }

    public static void a(awef awef, boolean z) {
        if (awef instanceof awen) {
            ((awen) awef).a(z);
            return;
        }
        String valueOf = String.valueOf(awef);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("cancel called with non-CancellableProducer: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}

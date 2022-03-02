package defpackage;

/* renamed from: asit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asit {
    asgb a = asgb.OPERATION_STATUS_PENDING;
    private final String b;
    private final Runnable c;

    public asit(String str, Runnable runnable) {
        this.b = str;
        this.c = runnable;
        jjg jjg = asil.a;
    }

    private final void a(asgb asgb, asgb... asgbArr) {
        asgb asgb2 = this.a;
        if (asgbArr != null) {
            int length = asgbArr.length;
            int i = 0;
            while (i < length) {
                if (asgbArr[i] != asgb2) {
                    i++;
                } else {
                    this.a = asgb;
                    this.c.run();
                    return;
                }
            }
        }
        anih anih = (anih) asil.a.b();
        anih.a((Throwable) new IllegalStateException());
        ((anih) anih.a("asit", "a", 69, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid state transition from %s to %s", (Object) this.a, (Object) asgb);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        a(asgb.OPERATION_STATUS_ACTIVE, asgb.OPERATION_STATUS_STARTING);
        jjg jjg = asil.a;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        a(asgb.OPERATION_STATUS_CANCELLED, asgb.OPERATION_STATUS_PENDING, asgb.OPERATION_STATUS_STARTING, asgb.OPERATION_STATUS_ACTIVE);
        jjg jjg = asil.a;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        a(asgb.OPERATION_STATUS_FINISHED, asgb.OPERATION_STATUS_CANCELLED, asgb.OPERATION_STATUS_ACTIVE);
        jjg jjg = asil.a;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.a == asgb.OPERATION_STATUS_FAILED || this.a == asgb.OPERATION_STATUS_FINISHED) {
            ((anih) ((anih) asil.a.c()).a("asit", "e", 53, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s cannot fail, in status: %s", (Object) this.b, (Object) this.a);
            return;
        }
        a(asgb.OPERATION_STATUS_FAILED, asgb.OPERATION_STATUS_PENDING, asgb.OPERATION_STATUS_STARTING, asgb.OPERATION_STATUS_ACTIVE, asgb.OPERATION_STATUS_MISSING, asgb.OPERATION_STATUS_CANCELLED);
        jjg jjg = asil.a;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return this.a == asgb.OPERATION_STATUS_PENDING;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.a == asgb.OPERATION_STATUS_PENDING;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.a == asgb.OPERATION_STATUS_PENDING || this.a == asgb.OPERATION_STATUS_STARTING || this.a == asgb.OPERATION_STATUS_ACTIVE;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.a == asgb.OPERATION_STATUS_PENDING || this.a == asgb.OPERATION_STATUS_ACTIVE || this.a == asgb.OPERATION_STATUS_CANCELLED;
    }

    public final String toString() {
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        switch (this.a.ordinal()) {
            case 1:
                return "OPERATION_STATUS_ACTIVE";
            case 2:
                return "OPERATION_STATUS_CANCELLED";
            case 3:
                return "OPERATION_STATUS_FINISHED";
            case 4:
                return "OPERATION_STATUS_FAILED";
            case 5:
                return "OPERATION_STATUS_MISSING";
            case 6:
                return "OPERATION_STATUS_PENDING";
            case 7:
                return "OPERATION_STATUS_STARTING";
            case 8:
                return "OPERATION_STATUS_UPDATE_FAILED";
            default:
                return "OPERATION_STATUS_UNKNOWN";
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        a(asgb.OPERATION_STATUS_STARTING, asgb.OPERATION_STATUS_PENDING);
        jjg jjg = asil.a;
    }
}

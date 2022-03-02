package defpackage;

/* renamed from: qxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qxk {
    public int a;
    public int b;
    public int c;

    public final qxl a() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        boolean z4 = false;
        if (i == 0) {
            z = true;
        } else {
            z = i == 1;
        }
        iva.b(z, "Must provide a valid RetryPolicy.");
        if (this.a != 0) {
            if (this.b >= 10) {
                z3 = true;
            } else {
                z3 = false;
            }
            iva.b(z3, "RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
        } else {
            if (this.b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            iva.b(z2, "RETRY_POLICY_EXPONENTIAL must have a positive initialBackoffSeconds.");
        }
        if (this.c > this.b) {
            z4 = true;
        }
        iva.b(z4, "MaximumBackoffSeconds must be greater than InitialBackoffSeconds.");
        return new qxl(this.a, this.b, this.c);
    }
}

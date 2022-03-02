package defpackage;

import com.google.android.gms.R;

/* renamed from: fqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fqf {
    public int a = R.drawable.ic_avatar_circle_40dp;
    public String b;
    public boolean c = false;
    public String d;
    public String e;

    public final fqg a() {
        return new fqg(this);
    }

    public final void a(int i, boolean z) {
        this.c = z;
        this.a = i;
    }

    public final void a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            a(R.drawable.quantum_ic_phone_white_24, false);
        } else if (i2 != 1) {
            a(R.drawable.ic_avatar_circle_40dp, true);
        } else {
            a(R.drawable.quantum_ic_email_white_24, false);
        }
    }
}

package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.mdd.FileGroupRequest;

/* renamed from: scf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class scf extends nis {
    public final String a;
    protected final afqn b;
    protected final FileGroupRequest c;
    protected final String d;
    protected final int e;
    protected final scg f;
    protected final afsb g;
    protected final long h = SystemClock.elapsedRealtime();

    public scf(String str, afqn afqn, FileGroupRequest fileGroupRequest, String str2, int i, scg scg, afsb afsb) {
        super(152, str);
        this.a = str;
        this.b = afqn;
        this.c = fileGroupRequest;
        this.d = str2;
        this.e = i;
        this.f = scg;
        this.g = afsb;
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        String str;
        Object[] objArr = new Object[7];
        objArr[0] = "AbstractFileGroupOp";
        objArr[1] = this.a;
        FileGroupRequest fileGroupRequest = this.c;
        objArr[2] = fileGroupRequest.a;
        objArr[3] = fileGroupRequest.b;
        Account account = fileGroupRequest.c;
        if (account != null) {
            str = account.name;
        } else {
            str = "no account";
        }
        objArr[4] = str;
        objArr[5] = this.d;
        objArr[6] = this.f;
        aucd o = aojg.g.o();
        String str2 = this.c.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aojg aojg = (aojg) o.b;
        str2.getClass();
        aojg.a |= 1;
        aojg.b = str2;
        aucd o2 = aoju.g.o();
        int a2 = a();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoju aoju = (aoju) o2.b;
        if (a2 != 1) {
            aoju.b = a2 - 2;
            aoju.a |= 1;
            aucd o3 = aoiv.d.o();
            String str3 = this.d;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aoiv aoiv = (aoiv) o3.b;
            str3.getClass();
            int i = aoiv.a | 1;
            aoiv.a = i;
            aoiv.b = str3;
            int i2 = this.e;
            aoiv.a = i | 2;
            aoiv.c = i2;
            aoiv aoiv2 = (aoiv) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoju aoju2 = (aoju) o2.b;
            aoiv2.getClass();
            aoju2.c = aoiv2;
            aoju2.a |= 4;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.h);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoju aoju3 = (aoju) o2.b;
            aoju3.a |= 16;
            aoju3.e = elapsedRealtime;
            try {
                a(o, o2);
            } finally {
                int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - this.h);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoju aoju4 = (aoju) o2.b;
                aoju4.a |= 32;
                aoju4.f = elapsedRealtime2;
                Object[] objArr2 = {"AbstractFileGroupOp", this.a, Integer.valueOf(aoju4.e), Integer.valueOf(((aoju) o2.b).f)};
                this.g.a((aojg) o.i(), (aoju) o2.i());
            }
        } else {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(aucd aucd, aucd aucd2);
}

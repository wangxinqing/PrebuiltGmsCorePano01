package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.auth.uiflows.addaccount.AddAccountController;

/* renamed from: glb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class glb {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ManagedAuthOptions E;
    public D2dOptions F;
    public fzo a;
    public glm b;
    public AccountAuthenticatorResponse c;
    public String d;
    public boolean e;
    public boolean f;
    public ijn g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String[] l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public Intent q;
    public Account r;
    public boolean s;
    public Intent t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public String y;
    public boolean z;

    public final AddAccountController a() {
        return new AddAccountController(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
    }
}

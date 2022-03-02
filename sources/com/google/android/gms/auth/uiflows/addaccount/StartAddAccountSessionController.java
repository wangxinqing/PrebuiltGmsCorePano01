package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StartAddAccountSessionController implements Controller {
    public static final Parcelable.Creator CREATOR = new gmo();
    private static final iwd a = ehv.a("AddAccount", "StartAddAccountSessionController");
    private static final int b = R.anim.sud_slide_next_in;
    private static final int c = R.anim.sud_slide_next_out;
    private static final int d = R.anim.sud_slide_back_in;
    private static final int e = R.anim.sud_slide_back_out;
    private final Context f = ihs.b();
    private final fzo g;
    private final AccountAuthenticatorResponse h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final ijn l;
    private final String m;
    private final String n;
    private final String[] o;
    private final String p;
    private final String q;
    private boolean r;
    private String s;
    private String t;
    private String u;
    private String v;
    private boolean w;

    public StartAddAccountSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z, boolean z2, ijn ijn, String str2, String str3, String[] strArr, String str4, String str5, boolean z3, boolean z4, String str6, String str7, String str8, String str9) {
        fzo fzo = new fzo(ihs.b());
        this.g = fzo;
        this.h = accountAuthenticatorResponse;
        this.i = str;
        this.j = z;
        this.l = ijn;
        this.k = z2;
        this.m = str2;
        this.n = str3;
        this.o = strArr;
        this.p = str4;
        this.q = str5;
        this.r = z3;
        this.w = z4;
        this.s = str6;
        this.t = str7;
        this.u = str8;
        this.v = str9;
    }

    private final Intent a(int i2) {
        return a(this.f.getString(i2));
    }

    private final gnw c() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.h;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "canceled");
        }
        return gnw.b(0, (Intent) null, d, e);
    }

    public final String b() {
        return "StartAddAccountSessionController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.h, 0);
        parcel.writeString(this.i);
        parcel.writeByte(this.j ? (byte) 1 : 0);
        parcel.writeByte(this.k ? (byte) 1 : 0);
        parcel.writeParcelable(this.l.a(), 0);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeStringArray(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeByte(this.r ? (byte) 1 : 0);
        parcel.writeByte(this.w ? (byte) 1 : 0);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
    }

    private final Intent a(String str) {
        fzl fzl = new fzl();
        fzl.b(gmz.j, Boolean.valueOf(this.k));
        fzl.b(gmz.i, this.l.a());
        if (!this.j) {
            fzl.b(ErrorChimeraActivity.c, 4);
        } else {
            fzl.b(ErrorChimeraActivity.e, true);
        }
        return ErrorChimeraActivity.a(this.f, str).putExtras(fzl.a);
    }

    private final gnw a() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.h;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "skipped or error");
        }
        return a(1, (Intent) null);
    }

    private static gnw a(int i2, Intent intent) {
        return gnw.b(i2, intent, b, c);
    }

    private static gnw a(Intent intent) {
        return gnw.a(19, intent, b, c);
    }

    public final gnw a(gny gny) {
        gny gny2 = gny;
        if (gny2 != null) {
            a.b(String.format("Result with id=%d and resultCode=%d", new Object[]{Integer.valueOf(gny2.a), Integer.valueOf(gny2.b)}), new Object[0]);
            Intent intent = gny2.c;
            fzl fzl = new fzl(intent == null ? new Bundle() : intent.getExtras());
            int i2 = gny2.a;
            if (i2 == 0) {
                int i3 = gny2.b;
                if (i3 == -1) {
                    Context context = this.f;
                    String str = this.i;
                    boolean z = this.j;
                    boolean z2 = this.k;
                    ijn ijn = this.l;
                    return gnw.a(10, MinuteMaidChimeraActivity.a(context, str, z, true, z2, ijn, this.o, (String) null, this.m, this.n, this.p, this.q, true, false, false, false, glk.a(context, false, str, ijn, true)));
                } else if (i3 == 0) {
                    return c();
                } else {
                    if (i3 == 1) {
                        return a(a((int) R.string.auth_error_generic_server_error));
                    }
                }
            } else if (i2 == 10) {
                int i4 = gny2.b;
                if (i4 == -1) {
                    this.s = (String) fzl.a(MinuteMaidChimeraActivity.b);
                    this.t = (String) fzl.a(MinuteMaidChimeraActivity.c);
                    this.u = (String) fzl.a(MinuteMaidChimeraActivity.d);
                    this.v = (String) fzl.a(MinuteMaidChimeraActivity.e);
                    this.w = ((Boolean) fzl.a(MinuteMaidChimeraActivity.g, false)).booleanValue();
                    boolean booleanValue = ((Boolean) fzl.a(MinuteMaidChimeraActivity.f, false)).booleanValue();
                    this.r = booleanValue;
                    Bundle a2 = FinishSessionChimeraActivity.a(this.j, this.k, this.l, this.s, this.t, this.w, booleanValue, this.u, this.i);
                    Bundle bundle = new Bundle();
                    bundle.putBundle("accountSessionBundle", a2);
                    bundle.putString("password", this.v);
                    Intent putExtras = new Intent().putExtras(bundle);
                    AccountAuthenticatorResponse accountAuthenticatorResponse = this.h;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onResult(bundle);
                    }
                    return a(-1, putExtras);
                } else if (i4 == 0) {
                    return c();
                } else {
                    if (i4 == 1) {
                        return a();
                    }
                    if (i4 == 2) {
                        String str2 = (String) fzl.a(MinuteMaidChimeraActivity.h);
                        if (str2 == null) {
                            str2 = this.f.getString(R.string.auth_error_generic_server_error);
                        }
                        return a(a(str2));
                    }
                }
            } else if (i2 == 19) {
                int i5 = gny2.b;
                if (i5 == -1) {
                    return a();
                }
                if (i5 == 0) {
                    return c();
                }
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(gny2.b)}));
        } else if (!this.g.a()) {
            return gnw.a(19, a((int) R.string.auth_error_no_network));
        } else {
            Intent a3 = ijk.a(this.f, this.k, this.j, this.l.a(), Bundle.EMPTY);
            if (a3 != null) {
                return gnw.a(0, WrapperControlledChimeraActivity.a(this.f, this.k, this.l, a3));
            }
            Context context2 = this.f;
            String str3 = this.i;
            boolean z3 = this.j;
            boolean z4 = this.k;
            ijn ijn2 = this.l;
            return gnw.a(10, MinuteMaidChimeraActivity.a(context2, str3, z3, true, z4, ijn2, this.o, (String) null, this.m, this.n, this.p, this.q, true, false, false, false, glk.a(context2, false, str3, ijn2, true)));
        }
    }
}

package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.controller.Controller;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FinishAddAccountSessionController implements Controller {
    public static final Parcelable.Creator CREATOR = new glw();
    private static final iwd a = ehv.a("AddAccount", "FinishAddAccountSessionController");
    private static final int b = R.anim.sud_slide_next_in;
    private static final int c = R.anim.sud_slide_next_out;
    private static final int d = R.anim.sud_slide_back_in;
    private static final int e = R.anim.sud_slide_back_out;
    private static final fzk f = fzk.a("token_handle");
    private boolean A;
    private boolean B;
    private String C;
    private final Context g = ihs.b();
    private final fzo h;
    private final AccountAuthenticatorResponse i;
    private final String j;
    private final boolean k;
    private final boolean l;
    private final ijn m;
    private final String n;
    private final boolean o;
    private final String p;
    private final String q;
    private final boolean r;
    private final boolean s;
    private final String t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private Account x;
    private String y = null;
    private boolean z;

    public FinishAddAccountSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z2, boolean z3, ijn ijn, String str2, String str3, String str4, boolean z4, boolean z5, String str5, boolean z6, boolean z7, boolean z8, Account account, String str6, boolean z9, boolean z10, boolean z11, String str7) {
        fzo fzo = new fzo(ihs.b());
        boolean isOwner = Process.myUserHandle().isOwner();
        this.h = fzo;
        this.i = accountAuthenticatorResponse;
        this.j = str;
        this.k = z2;
        this.m = ijn;
        this.l = z3;
        this.n = str2;
        this.p = str3;
        this.q = str4;
        this.r = z4;
        this.o = isOwner;
        this.x = account;
        this.s = z5;
        this.t = str5;
        this.v = z6;
        this.u = z7;
        this.w = z8;
        this.y = str6;
        this.z = z9;
        this.A = z10;
        this.B = z11;
        this.C = str7;
    }

    private final gnw a() {
        Intent a2;
        if (this.z || ((this.k && !jkr.b()) || (a2 = gmn.a(this.g, this.x, this.s, this.k, this.l, this.w, this.m)) == null)) {
            return c();
        }
        return b(30, WrapperControlledChimeraActivity.a(this.g, this.l, this.m, a2));
    }

    private final Intent b(int i2) {
        String string = this.g.getString(i2);
        fzl fzl = new fzl();
        fzl.b(gmz.j, Boolean.valueOf(this.l));
        fzl.b(gmz.i, this.m.a());
        if (!this.k) {
            fzl.b(ErrorChimeraActivity.c, 4);
        } else {
            fzl.b(ErrorChimeraActivity.e, true);
        }
        return ErrorChimeraActivity.a(this.g, string).putExtras(fzl.a);
    }

    private final gnw c() {
        Intent a2;
        if (!ijk.a(this.y) || (a2 = ijk.a(this.g, this.x, this.k, this.l, this.m.a(), this.u, this.t, this.o, this.y, this.B, 0, Bundle.EMPTY)) == null) {
            return a(4);
        }
        return a(40, WrapperControlledChimeraActivity.a(this.g, this.l, this.m, a2));
    }

    private final gnw d() {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", this.x.name);
        bundle.putString("accountType", this.x.type);
        bundle.putString("accountStatusToken", this.C);
        Intent putExtras = new Intent().putExtras(bundle);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.i;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        return c(-1, putExtras);
    }

    private final gnw e() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.i;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "canceled or skipped");
        }
        return gnw.b(0, (Intent) null, d, e);
    }

    public final String b() {
        return "FinishAddAccountSessionController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.i, 0);
        parcel.writeString(this.j);
        parcel.writeByte(this.k ? (byte) 1 : 0);
        parcel.writeByte(this.l ? (byte) 1 : 0);
        parcel.writeParcelable(this.m.a(), 0);
        parcel.writeString(this.n);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeByte(this.r ? (byte) 1 : 0);
        parcel.writeByte(this.s ? (byte) 1 : 0);
        parcel.writeString(this.t);
        parcel.writeByte(this.v ? (byte) 1 : 0);
        parcel.writeByte(this.u ? (byte) 1 : 0);
        parcel.writeByte(this.w ? (byte) 1 : 0);
        parcel.writeParcelable(this.x, 0);
        parcel.writeString(this.y);
        parcel.writeByte(this.z ? (byte) 1 : 0);
        parcel.writeByte(this.A ? (byte) 1 : 0);
        parcel.writeByte(this.B ? (byte) 1 : 0);
        parcel.writeString(this.C);
    }

    private final gnw a(int i2) {
        if (this.A) {
            return a(50, RemoveAccountChimeraActivity.a(this.g, this.x, i2, this.l, this.m));
        }
        return d();
    }

    private static gnw c(int i2, Intent intent) {
        return gnw.b(i2, intent, b, c);
    }

    private static gnw b(int i2, Intent intent) {
        return gnw.a(i2, intent, 17432576, 17432577);
    }

    private static gnw a(int i2, Intent intent) {
        return gnw.a(i2, intent, b, c);
    }

    public final gnw a(gny gny) {
        gny gny2 = gny;
        if (gny2 != null) {
            a.b(String.format("Result with id=%d and resultCode=%d", new Object[]{Integer.valueOf(gny2.a), Integer.valueOf(gny2.b)}), new Object[0]);
            Intent intent = gny2.c;
            fzl fzl = new fzl(intent == null ? new Bundle() : intent.getExtras());
            int i2 = gny2.a;
            if (i2 == 10) {
                int i3 = gny2.b;
                if (i3 == -1) {
                    return b(20, AddAccountChimeraActivity.a(this.g, this.j, this.k, this.p, this.q, this.n, this.r, false, this.l, false, this.m, false));
                } else if (i3 == 0) {
                    return e();
                } else {
                    if (i3 == 2) {
                        return b(70, b(R.string.auth_error_generic_server_error));
                    }
                }
            } else if (i2 == 20) {
                int i4 = gny2.b;
                if (i4 == -1) {
                    this.x = (Account) fzl.a(AddAccountChimeraActivity.a);
                    this.C = (String) fzl.a(f);
                    this.y = (String) fzl.a(AddAccountChimeraActivity.c);
                    this.B = ((Boolean) fzl.a(AddAccountChimeraActivity.d)).booleanValue();
                    if (ijk.a(this.y)) {
                        this.A = AddAccountController.b(this.B);
                        this.z = AddAccountController.a(this.B);
                        AddAccountController.a(this.g, this.x);
                    }
                    return a();
                } else if (i4 == 0) {
                    return e();
                } else {
                    if (i4 == 2) {
                        return a(70, b(R.string.auth_error_generic_server_error));
                    }
                    if (i4 == 3 || i4 == 4) {
                        return a(70, b(R.string.auth_error_generic_server_error));
                    }
                }
            } else if (i2 == 30) {
                int i5 = gny2.b;
                if (i5 == -1) {
                    return c();
                }
                if (i5 == 0) {
                    return gnw.a(60, AccountAddedChimeraActivity.a(this.g, this.l, this.m), d, e);
                }
            } else if (i2 == 40) {
                int i6 = gny2.b;
                if (i6 != -1) {
                    if (i6 == 2) {
                        return a(1);
                    }
                    if (i6 != 3) {
                        if (i6 == 5) {
                            return a(42, RemoveAccountChimeraActivity.a(this.g, this.x, 5, this.l, this.m));
                        }
                        if (i6 != 6) {
                            if (i6 == 8) {
                                return a(4);
                            }
                            if (i6 != 9) {
                                return a(3);
                            }
                            return a(42, RemoveAccountChimeraActivity.a(this.g, this.x, 6, this.l, this.m));
                        }
                    }
                    return a(2);
                } else if (!ijk.a(this.g)) {
                    return d();
                } else {
                    a.c("Device was provisioned by Device Management. Finishing SUW.", new Object[0]);
                    return d();
                }
            } else if (i2 == 42) {
                return d();
            } else {
                if (i2 == 50) {
                    int i7 = gny2.b;
                    if (i7 == -1) {
                        return e();
                    }
                    if (i7 == 0) {
                        AccountAuthenticatorResponse accountAuthenticatorResponse = this.i;
                        if (accountAuthenticatorResponse != null) {
                            accountAuthenticatorResponse.onError(4, "skipped or error");
                        }
                        return c(0, (Intent) null);
                    }
                } else if (i2 != 60) {
                    if (i2 == 70) {
                        return e();
                    }
                }
                return a();
            }
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(gny2.b)}));
        } else if (!this.h.a()) {
            return gnw.a(70, b(R.string.auth_error_no_network));
        } else {
            return gnw.a(10, PreAddAccountChimeraActivity.a(this.g, this.l, this.m, this.k));
        }
    }
}

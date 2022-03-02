package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: iae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iae {
    public final amzy a;
    public final boolean b;
    public final boolean c;
    public final Bundle d;
    public final Account e;
    public final String f;
    public final String g;
    public final Intent h;
    public final int i;
    public final boolean j;
    public final amri k;
    public final ArrayList l;
    public final String m;
    public final int n;
    private final amri o;

    public iae(Intent intent, int i2) {
        amzy amzy;
        boolean z;
        amri amri;
        this.h = intent;
        this.n = i2;
        String[] stringArrayExtra = intent.getStringArrayExtra("allowableAccountTypes");
        if (stringArrayExtra != null) {
            amzy = amzy.a((Object[]) stringArrayExtra);
        } else {
            amzy = null;
        }
        this.a = amzy;
        this.b = intent.getBooleanExtra("alwaysPromptForAccount", false);
        this.c = intent.getBooleanExtra("setGmsCoreAccount", false);
        this.d = intent.getBundleExtra("addAccountOptions");
        this.e = (Account) intent.getParcelableExtra("selectedAccount");
        this.f = intent.getStringExtra("descriptionTextOverride");
        String stringExtra = intent.getStringExtra("realClientPackage");
        amrl.a((Object) stringExtra);
        this.g = stringExtra;
        this.l = intent.getParcelableArrayListExtra("allowableAccounts");
        this.m = intent.getStringExtra("hostedDomainFilter");
        int i3 = i2 - 1;
        if (i3 == 0) {
            amri amri2 = ampu.a;
            Bundle bundleExtra = intent.getBundleExtra("first_party_options_bundle");
            if (bundleExtra != null) {
                this.o = amri.b(pyu.a(bundleExtra).a());
            } else {
                this.o = ampu.a;
            }
            if (!this.o.a() || !((pyu) this.o.b()).c()) {
                z = false;
            } else {
                z = true;
            }
            this.j = z;
            if (this.o.a()) {
                amri = ((pyu) this.o.b()).b();
            } else {
                amri = ampu.a;
            }
            this.k = amri;
            if (this.o.a() && ((pyu) this.o.b()).f().a()) {
                amri2 = ((pyu) this.o.b()).f();
            } else if (intent.hasExtra("overrideTheme")) {
                amri2 = amri.b(Integer.valueOf(intent.getIntExtra("overrideTheme", 0)));
            }
            if (amri2.a()) {
                int intValue = ((Integer) amri2.b()).intValue();
                if (intValue == 1) {
                    this.i = 2132017630;
                } else if (intValue == 1000) {
                    this.i = 2132017629;
                } else if (intValue != 1001) {
                    this.i = 2132017631;
                } else {
                    this.i = 2132017627;
                }
            } else {
                this.i = 0;
            }
        } else if (i3 != 1) {
            this.i = 2132017631;
            this.k = ampu.a;
            this.o = ampu.a;
            this.j = false;
        } else {
            this.i = 2132017633;
            this.k = ampu.a;
            this.o = ampu.a;
            this.j = false;
        }
    }

    public final amri a() {
        return this.o.a() ? ((pyu) this.o.b()).e() : ampu.a;
    }

    public final amri b() {
        return this.o.a() ? ((pyu) this.o.b()).d() : ampu.a;
    }
}

package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: asht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asht {
    public auyt a;
    public auyt b;
    private final auyt c = arwe.a();
    private final SharedPreferences d;

    public asht(Context context) {
        auyt auyt;
        this.d = context.getSharedPreferences("nearbydirect_configuration", 0);
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            auyt = arwe.a();
        } else {
            String string = sharedPreferences.getString("persistent", (String) null);
            if (string != null) {
                try {
                    byte[] decode = Base64.decode(string, 11);
                    auyt a2 = arwe.a();
                    aucd aucd = (aucd) a2.c(5);
                    aucd.a((aucj) a2);
                    aucf aucf = (aucf) aucd;
                    aucf.b(decode, aubs.c());
                    auyt = (auyt) aucf.i();
                } catch (auda | IllegalArgumentException e) {
                    anih anih = (anih) asil.a.b();
                    anih.a(e);
                    ((anih) anih.a("asht", "a", 100, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ConfigurationManager: reading stored configuration error");
                    a(this.c);
                    auyt = this.c;
                }
            } else {
                auyt = arwe.a();
            }
        }
        this.a = auyt;
        this.b = auyt;
    }

    private final auyt a() {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            return arwe.a();
        }
        String string = sharedPreferences.getString("persistent", (String) null);
        if (string == null) {
            return arwe.a();
        }
        try {
            byte[] decode = Base64.decode(string, 11);
            auyt a2 = arwe.a();
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            aucf aucf = (aucf) aucd;
            aucf.b(decode, aubs.c());
            return (auyt) aucf.i();
        } catch (auda | IllegalArgumentException e) {
            anih anih = (anih) asil.a.b();
            anih.a(e);
            ((anih) anih.a("asht", "a", 100, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ConfigurationManager: reading stored configuration error");
            a(this.c);
            return this.c;
        }
    }

    public final void b(auyt auyt) {
        auyt auyt2 = this.b;
        aucd aucd = (aucd) auyt2.c(5);
        aucd.a((aucj) auyt2);
        aucf aucf = (aucf) aucd;
        aucf.a((aucj) auyt);
        this.b = (auyt) aucf.i();
    }

    public final void a(auyt auyt) {
        this.d.edit().putString("persistent", Base64.encodeToString(auyt.k(), 11)).commit();
        this.a = auyt;
    }
}

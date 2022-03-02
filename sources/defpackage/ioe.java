package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.Configurations;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ioe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ioe extends imt {
    public ioe() {
        super("PhenotypeFallbackFix", 0);
    }

    private static final Configurations a(acwa acwa) {
        try {
            acws.a(acwa, 5000, TimeUnit.MILLISECONDS);
            return (Configurations) acwa.d();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("PhenotypeFallbackFix", "Retrieving configurations failed", e);
            return null;
        }
    }

    public final inb b(inb inb) {
        amzy amzy;
        String str;
        String str2;
        int i;
        String str3;
        Boolean bool;
        Log.i("PhenotypeFallbackFix", "Applying Phenotype flags fallback.");
        boolean u = awyw.a.a().u();
        Context context = inb.b;
        String str4 = !u ? "" : "(dry run) ";
        HashSet hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet<>();
        try {
            amzt j = amzy.j();
            for (ModuleManager.ModuleInfo metadata : ModuleManager.get(context).getAllModulesWithMetadata("com.google.android.gms.phenotype.registration.proto")) {
                for (nil nil : ((nim) aucj.a((aucj) nim.b, metadata.getMetadata(context).getByteArray("com.google.android.gms.phenotype.registration.proto"))).a) {
                    if (!nil.g) {
                        j.c(nil.b);
                    } else {
                        String valueOf = String.valueOf(nil.b);
                        if (valueOf.length() == 0) {
                            new String("Disregarding optOutRegister package: ");
                        } else {
                            "Disregarding optOutRegister package: ".concat(valueOf);
                        }
                    }
                }
            }
            String valueOf2 = String.valueOf(j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 16);
            sb.append("Packages found: ");
            sb.append(valueOf2);
            sb.toString();
            amzy = j.a();
        } catch (auda | InvalidConfigException e) {
            Log.e("PhenotypeFallbackFix", "Error retrieving info from packages registered with phenotype", e);
            amzy = amzy.h();
        }
        anhk i2 = amzy.listIterator();
        while (i2.hasNext()) {
            String str5 = (String) i2.next();
            if (awyw.g().length() > 0) {
                Iterator it = amsk.a(',').a((CharSequence) awyw.g()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str5.endsWith((String) it.next())) {
                            bool = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            bool = false;
            if (bool.booleanValue()) {
                StringBuilder sb2 = new StringBuilder(str4.length() + 30 + String.valueOf(str5).length());
                sb2.append(str4);
                sb2.append("Ignoring blacklisted package: ");
                sb2.append(str5);
                Log.i("PhenotypeFallbackFix", sb2.toString());
            } else if (!str5.startsWith("alt.")) {
                hashSet2.add(str5);
            } else {
                hashSet.add(str5.substring(4));
            }
        }
        hashSet2.removeAll(hashSet);
        aucd o = aogt.c.o();
        aucd o2 = aogs.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aogs aogs = (aogs) o2.b;
        if (!aogs.a.a()) {
            aogs.a = aucj.a(aogs.a);
        }
        auab.a((Iterable) hashSet2, (List) aogs.a);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aogs aogs2 = (aogs) o2.b;
        if (!aogs2.b.a()) {
            aogs2.b = aucj.a(aogs2.b);
        }
        auab.a((Iterable) hashSet, (List) aogs2.b);
        aogs aogs3 = (aogs) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aogt aogt = (aogt) o.b;
        aogs3.getClass();
        aogt.b = aogs3;
        aogt.a = 1;
        yey a = yef.a(context);
        Iterator it2 = hashSet.iterator();
        while (true) {
            str = "' failed";
            str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            String str6 = (String) it2.next();
            Configurations a2 = a(a.a(str6, "", (String) null));
            if (a2 != null) {
                String str7 = a2.a;
                String valueOf3 = String.valueOf(str6);
                Configurations a3 = a(a.a(str6, valueOf3.length() == 0 ? new String("alt.") : "alt.".concat(valueOf3), "", str7));
                if (a3 != null) {
                    if (u || a(context, a, str6, a3)) {
                        str = "' succeeded";
                    }
                    StringBuilder sb3 = new StringBuilder(str4.length() + 28 + String.valueOf(str6).length() + str.length());
                    sb3.append(str4);
                    sb3.append("Applying alternate config: '");
                    sb3.append(str6);
                    sb3.append(str);
                    Log.i("PhenotypeFallbackFix", sb3.toString());
                    inb inb2 = inb;
                } else {
                    inb inb3 = inb;
                }
            } else {
                inb inb4 = inb;
            }
        }
        for (String str8 : hashSet2) {
            Configurations a4 = a(a.a(str8, "com.google.EMPTY", "", str2));
            if (a4 != null) {
                if (!u && !a(context, a, str8, a4)) {
                    str3 = str;
                } else {
                    str3 = "' succeeded";
                }
                StringBuilder sb4 = new StringBuilder(str4.length() + 24 + String.valueOf(str8).length() + str3.length());
                sb4.append(str4);
                sb4.append("Applying empty config: '");
                sb4.append(str8);
                sb4.append(str3);
                Log.i("PhenotypeFallbackFix", sb4.toString());
                str2 = null;
            } else {
                str2 = null;
            }
        }
        Log.i("PhenotypeFallbackFix", str4.concat("Done applying Phenotype fallback fix."));
        if (!u) {
            i = 3;
        } else {
            i = 2;
        }
        ina d = inb.d();
        d.a(this, i, (aogt) o.i());
        return d.a();
    }

    static final boolean a(Context context, yey yey, String str, Configurations configurations) {
        return new iod(context, yey, str, configurations).a("");
    }

    public final boolean a(inb inb) {
        return awyw.a.a().v();
    }
}

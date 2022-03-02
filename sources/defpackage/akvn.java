package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: akvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvn {
    private static final String a = a("com.area120.reply", "com.google.android.apps.bigtop", "com.google.android.apps.car.carapp", "com.google.android.apps.inbox", "com.google.android.apps.kids.familycompass", "com.google.android.apps.nexuslauncher", "com.google.android.apps.spot", "com.google.android.apps.suggest", "com.google.android.apps.sunshine", "com.google.android.apps.telepathy", "com.google.android.apps.walletnfcrel", "com.google.android.apps.walletnfcrel.testing", "com.google.android.googlequicksearchbox", "com.google.android.keep", "com.google.android.music", "com.google.android.settings.intelligence", "com.google.android.street", "com.google.android.wearable.app", "com.google.android.wearable.chameleon", "com.google.commerce.tapandpay.alienfood", "com.google.commerce.tapandpay.dev", "com.waymo.carapp", "com.google.devrel.gmscore.memtest.places", "com.google.android.gms.apitest.places", "com.google.android.gms.common.uxtester", "com.google.android.gms.test_apps.location.places", "com.google.android.gms.test_apps.location.places.placepicker", "com.google.android.gms.test_apps.location.places.aliaseditor", "com.google.android.gms.test_apps.places", "com.google.android.gms.test_apps.places.autocompletewidget", "com.google.android.gms.test_apps.places.placepicker", "com.google.android.gms.test_apps.places.aliaseditor", "com.google.android.gms.testapps.places", "com.google.android.gms.testapps.places.geodata.firstparty", "com.google.android.gms.testapps.places.geodata.zeroparty", "com.google.android.gms.testapps.places.placepicker.zeroparty");
    private static final String b = a("auth", "autofill", "com.google.brella.datacollection", "reminders", "ulr");
    private static final String c = a("com.google.android.apps.gmm", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps", "com.google.android.apps.maps.sideload", "com.google.android.apps.plus", "com.google.android.apps.walletnfcrel", "com.google.android.apps.walletnfcrel.testing", "com.google.android.apps.youtube.music", "com.google.android.googlequicksearchbox", "com.google.android.keep", "com.google.android.settings.intelligence", "com.google.android.talk", "com.google.commerce.tapandpay.alienfood", "com.google.commerce.tapandpay.dev", "com.google.android.gms.apitest.places", "com.google.android.gms.test_apps.location.places", "com.google.android.gms.test_apps.location.places.placepicker", "com.google.android.gms.test_apps.places", "com.google.android.gms.test_apps.places.placepicker", "com.google.android.gms.testapps.places", "com.google.android.gms.testapp.userlocation");
    private static final String d = a("com.google.android.contextmanager.producer.module.PlacesProducer", "semanticlocation", "XGeoHeaderProducer");
    private final Set e;
    private final Set f;
    private final int g;

    public akvn(int i) {
        this.g = i;
        if (i != 1) {
            this.e = a(c);
            this.f = a(d);
            return;
        }
        this.e = a(a);
        this.f = a(b);
    }

    private final String a() {
        if (this.g != 1) {
            return azbn.a.a().h();
        }
        return azbn.a.a().d();
    }

    private final String b() {
        if (this.g != 1) {
            return azbn.a.a().e();
        }
        return azbn.a.a().a();
    }

    private final String c() {
        if (this.g != 1) {
            return azbn.a.a().g();
        }
        return azbn.a.a().c();
    }

    private final String d() {
        if (this.g != 1) {
            return azbn.a.a().f();
        }
        return azbn.a.a().b();
    }

    private static String a(String... strArr) {
        int length = strArr.length;
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(",");
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    private static final HashSet a(String str) {
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            for (String add : str.split(",")) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    private static final HashSet a(Set set, String str, String str2) {
        HashSet<String> a2 = a(str);
        HashSet a3 = a(str2);
        HashSet hashSet = new HashSet(set.size() + a2.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!a3.contains(str3)) {
                hashSet.add(str3);
            }
        }
        for (String str4 : a2) {
            if (!a3.contains(str4)) {
                hashSet.add(str4);
            }
        }
        return hashSet;
    }

    private static final void a(String str, Set set) {
        if (str == null || !set.contains(str)) {
            throw new nja(13, String.format("%s cannot access user data - contact android-places-team@google.com.", new Object[]{str}));
        }
    }

    public final void a(Context context, String str) {
        if (!hya.a(context).b(str)) {
            throw new nja(13, String.valueOf(str).concat(" doesn't have access to internal APIs."));
        }
    }

    public final void a(String str, String str2) {
        Set set;
        Set set2;
        if (!"com.google.android.gms".equals(str)) {
            if (a() == null || b() == null) {
                set2 = this.e;
            } else {
                set2 = a(this.e, a(), b());
            }
            a(str, set2);
            return;
        }
        if (c() == null || d() == null) {
            set = this.f;
        } else {
            set = a(this.f, c(), d());
        }
        a(str2, set);
    }
}

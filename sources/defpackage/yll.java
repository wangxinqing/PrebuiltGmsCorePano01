package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.OzDeviceInfoEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yll implements hcy {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final String e = "0";
    private static final String f = "1";
    private static final String g = "2";
    private static final String h = "3";
    private static final String i = "4";
    private final izq b;
    private final Configuration c;
    private final PackageManager d;

    public yll(Context context, Intent intent) {
        this.b = new izq(intent);
        this.c = context.getResources().getConfiguration();
        this.d = context.getPackageManager();
    }

    private static zgz a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        if (favaDiagnosticsEntity == null) {
            return null;
        }
        zgy zgy = new zgy();
        zgy.a = favaDiagnosticsEntity.b;
        zgy.c.add(2);
        zgy.b = favaDiagnosticsEntity.c;
        zgy.c.add(3);
        return new FavaDiagnosticsNamespacedTypeEntity(zgy.c, zgy.a, zgy.b);
    }

    public final /* bridge */ /* synthetic */ void a(hdd hdd) {
        String str;
        Integer num;
        DefaultChimeraIntentService defaultChimeraIntentService = (DefaultChimeraIntentService) hdd;
        String a2 = this.b.a();
        FavaDiagnosticsEntity d2 = this.b.d();
        FavaDiagnosticsEntity b2 = this.b.b();
        FavaDiagnosticsEntity c2 = this.b.c();
        int intExtra = this.b.a.getIntExtra("duration", 0);
        ClientActionDataEntity clientActionDataEntity = (ClientActionDataEntity) this.b.a.getParcelableExtra("clientActionData");
        String stringExtra = this.b.a.getStringExtra("callingPackage");
        String str2 = null;
        if (stringExtra != null) {
            String str3 = (String) a.get(stringExtra);
            if (str3 == null) {
                try {
                    str2 = jhg.e(defaultChimeraIntentService, stringExtra);
                } catch (PackageManager.NameNotFoundException e2) {
                }
                if (str2 != null) {
                    a.put(stringExtra, str2);
                }
            } else {
                str2 = str3;
            }
        }
        ActionTargetEntity actionTargetEntity = (ActionTargetEntity) this.b.a.getParcelableExtra("actionTarget");
        String stringExtra2 = this.b.a.getStringExtra("plusPageId");
        zhj zhj = new zhj();
        zhj.d = Build.FINGERPRINT;
        zhj.i.add(5);
        zhj.e = Build.MANUFACTURER;
        zhj.i.add(6);
        int i2 = this.c.orientation;
        if (i2 != 0) {
            str = i2 != 1 ? i2 != 2 ? i2 != 3 ? e : h : f : g;
        } else {
            str = i;
        }
        zhj.f = str;
        zhj.i.add(7);
        int i3 = Build.VERSION.SDK_INT;
        zhj.g = this.c.screenHeightDp;
        DefaultChimeraIntentService defaultChimeraIntentService2 = defaultChimeraIntentService;
        zhj.i.add(8);
        zhj.h = this.c.screenWidthDp;
        zhj.i.add(9);
        zhj.b = this.d.hasSystemFeature("android.hardware.screen.landscape");
        zhj.i.add(3);
        String str4 = stringExtra2;
        zhj.c = this.d.hasSystemFeature("android.hardware.screen.portrait");
        zhj.i.add(4);
        int i4 = Build.VERSION.SDK_INT;
        zhj.a = this.c.densityDpi;
        zhj.i.add(2);
        String str5 = a2;
        ClientActionDataEntity clientActionDataEntity2 = clientActionDataEntity;
        ActionTargetEntity actionTargetEntity2 = actionTargetEntity;
        String str6 = str2;
        String str7 = stringExtra;
        OzDeviceInfoEntity ozDeviceInfoEntity = new OzDeviceInfoEntity(zhj.i, zhj.a, zhj.b, zhj.c, zhj.d, zhj.e, zhj.f, zhj.g, zhj.h);
        zgz a3 = a(d2);
        zgz a4 = a(b2);
        zgz a5 = a(c2);
        zgw zgw = new zgw();
        zgw.d = intExtra;
        zgw.e.add(24);
        if (a3 != null) {
            zgw.a = (FavaDiagnosticsNamespacedTypeEntity) a3;
            zgw.e.add(3);
        }
        zgw.c = (FavaDiagnosticsNamespacedTypeEntity) a4;
        zgw.e.add(20);
        if (a5 != null) {
            zgw.b = (FavaDiagnosticsNamespacedTypeEntity) a5;
            zgw.e.add(4);
        }
        com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity favaDiagnosticsEntity = new com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity(zgw.e, zgw.a, zgw.b, zgw.c, zgw.d);
        zhl zhl = new zhl();
        zhl.c = favaDiagnosticsEntity;
        zhl.g.add(7);
        zhl.d = true;
        zhl.g.add(10);
        zhl.e = str7;
        zhl.g.add(14);
        zhl.f = str6;
        zhl.g.add(15);
        zhl.b = ozDeviceInfoEntity;
        zhl.g.add(5);
        if (actionTargetEntity2 != null) {
            zhl.a = actionTargetEntity2;
            num = 2;
            zhl.g.add(2);
        } else {
            num = 2;
        }
        OzEventEntity ozEventEntity = new OzEventEntity(zhl.g, zhl.a, zhl.b, zhl.c, zhl.d, zhl.e, zhl.f);
        zgk zgk = new zgk();
        zgk.c = ozEventEntity;
        zgk.d.add(5);
        zgk.b = System.currentTimeMillis();
        zgk.d.add(3);
        if (clientActionDataEntity2 != null) {
            zgk.a = clientActionDataEntity2;
            zgk.d.add(num);
        }
        ClientOzEventEntity clientOzEventEntity = new ClientOzEventEntity(zgk.d, zgk.a, zgk.b, zgk.c);
        ContentValues contentValues = new ContentValues();
        contentValues.put("accountName", str5);
        contentValues.put("type", 1);
        contentValues.put("payload", clientOzEventEntity.toString());
        contentValues.put("onBehalfOf", str4);
        contentValues.put("timestamp", Long.valueOf(clientOzEventEntity.d));
        defaultChimeraIntentService2.getContentResolver().insert(ytx.a, contentValues);
    }
}

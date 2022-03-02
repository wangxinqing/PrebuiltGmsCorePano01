package com.google.android.gms.people.phenotype;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegisterPhenotypeOperation extends IntentOperation {
    public static int a(Context context, Intent intent) {
        if (intent == null || !intent.hasExtra("first_sdk_extra")) {
            return xiq.a(context);
        }
        return intent.getIntExtra("first_sdk_extra", -1);
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        byte[] bArr;
        if (intent.hasExtra("mendel_package_name")) {
            str = jlh.a(intent.getStringExtra("mendel_package_name"));
        } else {
            str = "com.google.android.gms.people";
        }
        yey a = yef.a((Context) this);
        int b = jlo.b();
        String[] strArr = {"GMS_CORE_PEOPLE", "CHIPS"};
        if (!str.equals("com.google.android.gms.people.ui")) {
            aucd o = wkt.c.o();
            int a2 = a(this, intent);
            if (o.c) {
                o.c();
                o.c = false;
            }
            wkt wkt = (wkt) o.b;
            wkt.a = 1 | wkt.a;
            wkt.b = a2;
            bArr = ((wkt) o.i()).k();
        } else {
            bArr = null;
        }
        acwa a3 = a.a(str, b, strArr, bArr);
        a3.a((Executor) Executors.newCachedThreadPool(), (acvp) new xir(this, this, str, intent));
        try {
            acws.a(a3, 10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("PeopleGmsPhenoRgstrIntentOp", "Google Api connection failed");
        }
    }
}

package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.support.v4.graphics.drawable.IconCompat;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.slice.Slice;
import androidx.slice.SliceSpec;
import com.google.android.chimera.ModuleContext;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: bss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bss {
    public final Handler a = new Handler(Looper.getMainLooper());
    public String b;
    public final bsq c;
    public final aoy d;
    public final aox e;
    public final Runnable f = new bsr(this);
    private final Context g;

    public bss(bsq bsq, aox aox, Context context) {
        this.c = bsq;
        this.g = context;
        String valueOf = String.valueOf(getClass().getName());
        String str = valueOf.length() == 0 ? new String("slice_data_") : "slice_data_".concat(valueOf);
        SharedPreferences sharedPreferences = this.g.getSharedPreferences("slice_data_all_slice_files", 0);
        Set<String> stringSet = sharedPreferences.getStringSet("slice_data_all_slice_files", Collections.emptySet());
        if (!stringSet.contains(str)) {
            ob obVar = new ob((Collection) stringSet);
            obVar.add(str);
            sharedPreferences.edit().putStringSet("slice_data_all_slice_files", obVar).commit();
        }
        this.d = new aoy(this.g, str);
        this.e = aox;
    }

    public static Set a(Bundle bundle) {
        ob obVar = new ob();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("specs");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("revs");
        if (!(stringArrayList == null || integerArrayList == null)) {
            for (int i = 0; i < stringArrayList.size(); i++) {
                obVar.add(new SliceSpec(stringArrayList.get(i), integerArrayList.get(i).intValue()));
            }
        }
        return obVar;
    }

    public final Slice a(Uri uri, String str) {
        Handler handler;
        Runnable runnable;
        if (str == null) {
            str = this.g.getPackageManager().getNameForUid(Binder.getCallingUid());
        }
        Slice slice = null;
        if (this.e.a(uri, Binder.getCallingPid(), Binder.getCallingUid()) == 0) {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            this.b = "onBindSlice";
            this.a.postDelayed(this.f, 2000);
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyDeath().build());
                try {
                    slice = this.c.a(uri);
                    handler = this.a;
                    runnable = this.f;
                } catch (Exception e2) {
                    String uri2 = uri.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 27);
                    sb.append("Slice with URI ");
                    sb.append(uri2);
                    sb.append(" is invalid.");
                    Log.wtf("ChimeraSliceProviderCom", sb.toString(), e2);
                    handler = this.a;
                    runnable = this.f;
                }
                handler.removeCallbacks(runnable);
                StrictMode.setThreadPolicy(threadPolicy);
                return slice;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } else {
            Context context = this.g;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context.getPackageName(), "androidx.slice.compat.SlicePermissionActivity"));
            intent.putExtra("slice_uri", uri);
            intent.putExtra("pkg", str);
            intent.putExtra("provider_pkg", context.getPackageName());
            intent.setData(uri.buildUpon().appendQueryParameter("package", str).build());
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 0);
            anr anr = new anr(uri);
            anr anr2 = new anr(anr);
            anr2.a(IconCompat.a(ModuleContext.getModuleContext(context).getContainerResources(), context.getPackageName(), hdg.a(context, R.drawable.abc_ic_permission)), (String) null, new String[0]);
            anr2.a(Arrays.asList(new String[]{"title", "shortcut"}));
            anr2.a(activity, new anr(anr).a(), (String) null);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(context, 16974123).getTheme().resolveAttribute(16843829, typedValue, true);
            int i = typedValue.data;
            anr anr3 = new anr(uri.buildUpon().appendPath("permission").build());
            anr3.a(IconCompat.a(ModuleContext.getModuleContext(context).getContainerResources(), context.getPackageName(), hdg.a(context, R.drawable.abc_ic_arrow_forward)), (String) null, new String[0]);
            PackageManager packageManager = context.getPackageManager();
            try {
                anr3.a((CharSequence) ModuleContext.getModuleContext(context).getContainerContext().getString(hdg.a(context, R.string.abc_slices_permission_request), new Object[]{packageManager.getApplicationInfo(str, 0).loadLabel(packageManager), context.getApplicationInfo().loadLabel(packageManager)}), (String) null, new String[0]);
                anr3.a(i, "color", new String[0]);
                anr3.a(anr2.a(), (String) null);
                anr.a(anr3.a(), (String) null);
                anr.a(Arrays.asList(new String[]{"permission_request"}));
                return anr.a();
            } catch (PackageManager.NameNotFoundException e3) {
                throw new RuntimeException("Unknown calling app", e3);
            }
        }
    }

    public final String a() {
        return this.c.getCallingPackage();
    }
}

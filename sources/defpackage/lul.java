package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lul extends lut {
    final /* synthetic */ lum a;

    public lul(lum lum) {
        this.a = lum;
    }

    public final void a() {
        luj luj;
        lum lum = this.a;
        lum.c.removeAllViews();
        LayoutInflater from = LayoutInflater.from(lum.getContext());
        String a2 = lum.a.a().a();
        luu luu = lum.a;
        List<ResolveInfo> queryIntentActivities = luu.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT"), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            if (next.activityInfo != null) {
                arrayList.add(next.activityInfo.packageName);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (TextUtils.equals("com.google.android.projection.gearhead", str)) {
                luj = new lta();
            } else {
                luj = new ltt(str);
            }
            if (luj.c(luu.a)) {
                arrayList2.add(luj);
            }
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            luj luj2 = (luj) arrayList2.get(i2);
            String a3 = luj2.a();
            if (luj2.c() != 2) {
                lum.a(from, luj2.a(lum.getContext()), (CharSequence) null, TextUtils.equals(a2, a3), a3);
            }
        }
        boolean d = new lta().d(lum.getContext());
        int i3 = !d ? R.string.car_driving_mode_behavior_android_auto_not_installed_pref_option_summary : R.string.car_driving_mode_behavior_android_auto_pref_option_summary;
        if (awqj.d() || d) {
            lum.a(from, lum.getString(R.string.car_driving_mode_behavior_android_auto_pref_option_title), lum.getString(i3), TextUtils.equals(a2, "com.google.android.projection.gearhead"), "com.google.android.projection.gearhead");
        }
        if (awqj.b()) {
            lum.a(from, lum.getString(R.string.car_driving_mode_behavior_morris_pref_option_title), lum.getString(R.string.car_driving_mode_behavior_morris_pref_option_summary), TextUtils.equals(a2, "car_pref_key_driving_mode_behavior_morris_preference"), "car_pref_key_driving_mode_behavior_morris_preference");
        }
        if (aycw.a.a().showDndBehavior()) {
            lum.a(from, lum.getString(R.string.car_driving_mode_behavior_dnd_pref_option_title), (CharSequence) null, TextUtils.equals(a2, "car_pref_key_driving_mode_behavior_dnd_preference"), "car_pref_key_driving_mode_behavior_dnd_preference");
        }
        if (awqj.c() || (!d && !lum.b.a() && !awqj.b())) {
            lum.a(from, lum.getString(R.string.car_driving_mode_behavior_empty_pref_option_title), (CharSequence) null, TextUtils.equals(a2, "car_pref_key_driving_mode_behavior_none_preference"), "car_pref_key_driving_mode_behavior_none_preference");
        }
    }
}

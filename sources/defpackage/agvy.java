package defpackage;

import android.content.SharedPreferences;

/* renamed from: agvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agvy implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final agvz a;

    public agvy(agvz agvz) {
        this.a = agvz;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.a();
    }
}

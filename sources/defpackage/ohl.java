package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.CompoundButton;

/* renamed from: ohl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ohl implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ oho a;

    public ohl(oho oho) {
        this.a = oho;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        ohq ohq;
        String str2;
        Cursor a2;
        this.a.a(150);
        oho oho = this.a;
        ohr ohr = oho.e;
        avmc avmc = oho.d;
        int a3 = avmb.a(avmc.b);
        Boolean bool = null;
        if (a3 != 0 && a3 == 2) {
            if (!z) {
                str = "0";
            } else {
                str = "1";
            }
            if (!TextUtils.isEmpty(avmc.c) && !TextUtils.isEmpty(str) && (a2 = ohr.a(new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(avmc.c).appendQueryParameter("new_setting_value", str).build())) != null) {
                try {
                    a2.moveToPosition(0);
                    ohq = new ohq();
                    ohq.a = a2.getString(0);
                    a2.getString(1);
                    a2.getString(2);
                    a2.getString(3);
                } catch (Exception e) {
                }
                if (!(ohq == null || (str2 = ohq.a) == null)) {
                    bool = ohr.a(str2);
                }
            }
            ohq = null;
            bool = ohr.a(str2);
        }
        if (bool == null || bool.booleanValue() != z) {
            compoundButton.setChecked(!z);
        }
    }
}

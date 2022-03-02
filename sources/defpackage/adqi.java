package defpackage;

import android.text.TextUtils;
import com.google.android.gms.R;

/* renamed from: adqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adqi extends adqj {
    public final String a() {
        return getString(R.string.system_update_installing_title_text);
    }

    public final String b() {
        return TextUtils.expandTemplate(getText(R.string.system_update_install_steps_text), new CharSequence[]{"1"}).toString();
    }
}

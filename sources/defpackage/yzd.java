package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: yzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yzd {
    public static void a(LayoutInflater layoutInflater, View view, boolean z) {
        layoutInflater.inflate(!z ? R.layout.plus_oob_title : R.layout.plus_oob_title_setup_wizard, (ViewGroup) view.findViewById(R.id.title_layout), true);
    }
}

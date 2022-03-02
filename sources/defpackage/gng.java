package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: gng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gng extends gna {
    public static final fzk b = fzk.a("title_res_id");

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fzc fzc = (fzc) layoutInflater.inflate(R.layout.auth_progress_dialog, viewGroup, false);
        fzl fzl = this.a;
        if (fzl != null) {
            Integer num = (Integer) fzl.a(b);
            if (num != null) {
                fzc.a(getString(num.intValue()));
            }
            return fzc;
        }
        throw new IllegalStateException("Must not access state before fragment onCreate().");
    }
}

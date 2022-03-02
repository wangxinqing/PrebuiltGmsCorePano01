package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: ewm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ewm extends qcg {
    public View a;
    public fcq b;
    public eyf c;
    public fgr d;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.c = (eyf) qck.a(activity).a(eyf.class);
        this.b = (fcq) qck.a(activity).a(fcq.class);
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new ewl(this));
        this.d = new fgr(this, this.c.g, (hol) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new vt((Context) getActivity(), (int) R.style.AppBottomSheetDialogTheme)).inflate(R.layout.credentials_assisted_loading_fragment, viewGroup, false);
        this.a = inflate.findViewById(R.id.loading_container);
        inflate.findViewById(R.id.cancel).setOnClickListener(new ewk(this));
        return inflate;
    }
}

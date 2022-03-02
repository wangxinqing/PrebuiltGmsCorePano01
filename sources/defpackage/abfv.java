package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.chimera.ListFragment;

/* renamed from: abfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abfv extends ListFragment {
    public ablp a;
    private int b;
    private String c;
    private String d;
    private String e;
    private abmb f;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.b = arguments.getInt("applicationId");
        this.c = arguments.getString("viewerAccountName");
        this.d = arguments.getString("qualifiedId");
        this.e = arguments.getString("viewerPageId");
        this.f = new abmb(getLoaderManager(), getActivity(), this.b, this.d, this.c, this.e);
        this.a = new ablp(getLoaderManager(), getActivity());
    }

    public final void onStart() {
        super.onStart();
        getListView().setDivider((Drawable) null);
        this.f.a(1, new abfu(this));
    }
}

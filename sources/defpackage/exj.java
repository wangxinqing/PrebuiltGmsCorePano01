package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: exj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class exj extends qcg {
    public static final iwd a = ehv.b("GoogleSignInAccountChooserFragment");
    private static final int i = R.style.CredentialsDialogTheme;
    public hol b;
    public eze c;
    public pzg d;
    public fbw e;
    public View f;
    public TextView g;
    public ProgressBar h;
    private ImageView j;
    private RecyclerView k;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = new hol(getContext(), "IDENTITY_GMSCORE", (String) null);
        Activity activity = getActivity();
        pzg pzg = (pzg) qck.a(activity).a(pzg.class);
        this.d = pzg;
        pzg.d.a(this, new exc(this));
        this.d.c.a(this, new exd(this));
        this.d.f.a(this, new exe(this));
        this.d.g.a(this, new exf(this));
        eze eze = (eze) qck.a(activity).a(eze.class);
        this.c = eze;
        eze.i.a(this, new exg(this));
        View view = getView();
        this.j = (ImageView) view.findViewById(R.id.app_icon);
        this.g = (TextView) view.findViewById(R.id.subtitle);
        this.k = (RecyclerView) view.findViewById(R.id.list);
        fbw fbw = new fbw(R.layout.credentials_account_chooser_header, new exh(this), this.c.f);
        this.e = fbw;
        this.k.setAdapter(fbw);
        this.k.setHasFixedSize(true);
        RecyclerView recyclerView = this.k;
        getContext();
        recyclerView.setLayoutManager(new abk());
        if (this.g != null) {
            this.j.setImageBitmap(this.c.f);
            this.g.setText(getString(R.string.credentials_assisted_choose_account_subtitle, this.c.e));
        }
        this.h = (ProgressBar) view.findViewById(R.id.loading_progress);
        View findViewById = view.findViewById(R.id.container_overlay);
        this.f = findViewById;
        findViewById.setOnTouchListener(exi.a);
        pze a2 = pze.a(this.c.c, amzy.a((Object) "com.google"), this.c.d.b);
        getChildFragmentManager().beginTransaction().add((Fragment) a2, "account_chooser_fragment").commitNow();
        a2.a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.cloneInContext(new vt((Context) getActivity(), i)).inflate(R.layout.credentials_account_chooser_fragment, viewGroup, false);
    }
}

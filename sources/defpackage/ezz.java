package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;

/* renamed from: ezz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ezz extends qcg {
    public static final iwd a = ehv.b("AuthorizationAccountChooserFragment");
    private static final int f = R.style.CredentialsDialogTheme;
    public fbn b;
    public TextView c;
    public fbw d;
    public CharSequence e;
    private pzg g;
    private ImageView h;
    private RecyclerView i;
    private ProgressBar j;
    private View k;
    private boolean l;
    private String m;
    private Bitmap n;

    public static ezz a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        ezz ezz = new ezz();
        ezz.setArguments(bundle);
        return ezz;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.b = (fbn) qck.a(activity).a(fbn.class);
        this.g = (pzg) qck.a(activity).a(pzg.class);
        amri a2 = pzs.a(getContext().getApplicationContext(), this.m);
        if (!a2.a()) {
            this.b.a(new fbm(new Status(10, "Calling package not found."), ampu.a));
            return;
        }
        this.e = (CharSequence) ((oq) a2.b()).a;
        this.n = (Bitmap) ((oq) a2.b()).b;
        View view = getView();
        this.h = (ImageView) view.findViewById(R.id.app_icon);
        this.c = (TextView) view.findViewById(R.id.subtitle);
        this.i = (RecyclerView) view.findViewById(R.id.list);
        fbw fbw = new fbw(R.layout.credentials_account_chooser_header, this.g, this.n);
        this.d = fbw;
        this.i.setAdapter(fbw);
        this.i.setHasFixedSize(true);
        RecyclerView recyclerView = this.i;
        getContext();
        recyclerView.setLayoutManager(new abk());
        if (this.c != null) {
            this.h.setImageBitmap(this.n);
            this.c.setText(getString(R.string.credentials_authorization_account_header_subtitle, this.e));
        }
        this.j = (ProgressBar) view.findViewById(R.id.loading_progress);
        View findViewById = view.findViewById(R.id.container_overlay);
        this.k = findViewById;
        findViewById.setOnTouchListener(ezy.a);
        a(this.l);
        this.g.d.a(this, new ezv(this));
        this.g.c.a(this, new ezw(this));
        this.g.f.a(this, new ezx(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new vt((Context) getActivity(), f)).inflate(R.layout.credentials_account_chooser_fragment, viewGroup, false);
        if (bundle != null) {
            this.l = bundle.getBoolean("block_user_interaction", false);
        }
        this.m = getArguments().getString("calling_package");
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("block_user_interaction", this.l);
        super.onSaveInstanceState(bundle);
    }

    public final void a(boolean z) {
        this.l = z;
        View view = this.k;
        int i2 = !z ? 8 : 0;
        view.setVisibility(i2);
        this.j.setVisibility(i2);
    }
}

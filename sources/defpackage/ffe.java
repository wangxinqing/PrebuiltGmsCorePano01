package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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

/* renamed from: ffe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ffe extends qcg {
    public static final iwd a = ehv.b("SaveAccountLinkingTokenAccountChooserFragment");
    private static final int e = R.style.CredentialsDialogTheme;
    public fek b;
    public TextView c;
    public fbw d;
    private pzg f;
    private ImageView g;
    private RecyclerView h;
    private ProgressBar i;
    private View j;
    private boolean k;
    private String l;
    private Bitmap m;

    public static ffe a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        ffe ffe = new ffe();
        ffe.setArguments(bundle);
        return ffe;
    }

    public final void onActivityCreated(Bundle bundle) {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.b = (fek) qck.a(activity).a(fek.class);
        this.f = (pzg) qck.a(activity).a(pzg.class);
        if (!pzs.a(getContext().getApplicationContext(), this.l).a()) {
            this.b.a(new fej(new Status(10, "Calling package not found."), ampu.a));
            return;
        }
        Drawable b2 = uj.b(getContext(), R.drawable.googlelogo_standard_color_74x24);
        if (b2 != null) {
            if (b2 instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) b2;
                if (bitmapDrawable.getBitmap() != null) {
                    bitmap = bitmapDrawable.getBitmap();
                }
            }
            if (b2.getIntrinsicWidth() <= 0 || b2.getIntrinsicHeight() <= 0) {
                bitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            } else {
                bitmap2 = Bitmap.createBitmap(b2.getIntrinsicWidth(), b2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(bitmap2);
            b2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            b2.draw(canvas);
            bitmap = bitmap2;
        } else {
            bitmap = null;
        }
        this.m = bitmap;
        View view = getView();
        this.g = (ImageView) view.findViewById(R.id.app_icon);
        this.c = (TextView) view.findViewById(R.id.title);
        this.h = (RecyclerView) view.findViewById(R.id.list);
        fbw fbw = new fbw(R.layout.credentials_save_account_linking_token_account_chooser_header_row, this.f, this.m);
        this.d = fbw;
        this.h.setAdapter(fbw);
        this.h.setHasFixedSize(true);
        RecyclerView recyclerView = this.h;
        getContext();
        recyclerView.setLayoutManager(new abk());
        if (this.c != null) {
            float dimension = getResources().getDimension(R.dimen.credentials_save_account_linking_token_account_chooser_logo_width);
            float dimension2 = getResources().getDimension(R.dimen.credentials_save_account_linking_token_account_chooser_logo_height);
            this.g.getLayoutParams().width = (int) dimension;
            this.g.getLayoutParams().height = (int) dimension2;
            view.findViewById(R.id.subtitle).setVisibility(8);
            this.g.setImageBitmap(this.m);
            this.c.setText(R.string.credentials_saving_account_linking_token_account_header_title);
        }
        this.i = (ProgressBar) view.findViewById(R.id.loading_progress);
        View findViewById = view.findViewById(R.id.container_overlay);
        this.j = findViewById;
        findViewById.setOnTouchListener(ffd.a);
        a(this.k);
        this.f.d.a(this, new ffa(this));
        this.f.c.a(this, new ffb(this));
        this.f.f.a(this, new ffc(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new vt((Context) getActivity(), e)).inflate(R.layout.credentials_account_chooser_fragment, viewGroup, false);
        if (bundle != null) {
            this.k = bundle.getBoolean("block_user_interaction", false);
        }
        this.l = getArguments().getString("calling_package");
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("block_user_interaction", this.k);
        super.onSaveInstanceState(bundle);
    }

    public final void a(boolean z) {
        this.k = z;
        View view = this.j;
        int i2 = !z ? 8 : 0;
        view.setVisibility(i2);
        this.i.setVisibility(i2);
    }
}

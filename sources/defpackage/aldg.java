package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.places.ui.placepicker.ConfirmView$SavedState;

/* renamed from: aldg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aldg extends FrameLayout implements alcx {
    public final alda a;
    private final TextView b;
    private final ProgressBar c;
    private final TextView d;
    private final TextView e;
    private final ViewGroup f;
    private final ImageView g;
    private final MapView h;
    private final Button i;
    private boolean j = false;

    public aldg(Context context, alda alda) {
        super(context);
        setId(R.id.place_picker_confirm_view);
        this.a = alda;
        LayoutInflater.from(context).inflate(R.layout.place_picker_confirm, this);
        MapView mapView = (MapView) findViewById(R.id.map);
        this.h = mapView;
        try {
            mapView.a((Bundle) null);
        } catch (NullPointerException e2) {
        }
        this.h.setClickable(false);
        this.h.a((rqs) new aldd());
        this.b = (TextView) findViewById(R.id.card_title);
        this.c = (ProgressBar) findViewById(R.id.place_details_loading_spinner);
        this.d = (TextView) findViewById(R.id.place_name);
        this.e = (TextView) findViewById(R.id.place_address);
        this.g = (ImageView) findViewById(R.id.place_photo);
        this.f = (ViewGroup) findViewById(R.id.place_media_container);
        Button button = (Button) findViewById(R.id.confirm_button);
        this.i = button;
        button.setOnClickListener(new aldb(this));
        findViewById(R.id.cancel_button).setOnClickListener(new aldc(this));
        int i2 = Build.VERSION.SDK_INT;
        ((ViewGroup) findViewById(R.id.card_container)).setLayoutTransition(new LayoutTransition());
        this.a.a((alcx) this);
    }

    public final void a(int i2) {
        this.b.setText(i2);
    }

    public final void b(CharSequence charSequence) {
        this.e.setText(charSequence);
        this.e.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ConfirmView$SavedState confirmView$SavedState = (ConfirmView$SavedState) parcelable;
        super.onRestoreInstanceState(confirmView$SavedState.getSuperState());
        this.j = confirmView$SavedState.a;
        int i2 = Build.VERSION.SDK_INT;
        this.f.animate().cancel();
        this.f.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        ConfirmView$SavedState confirmView$SavedState = new ConfirmView$SavedState(super.onSaveInstanceState());
        confirmView$SavedState.a = this.j;
        return confirmView$SavedState;
    }

    public final void a(Bitmap bitmap) {
        this.g.setImageBitmap(bitmap);
        this.g.setVisibility(bitmap == null ? 8 : 0);
    }

    public final void a(LatLng latLng) {
        if (!this.j) {
            int i2 = Build.VERSION.SDK_INT;
            this.f.setAlpha(0.0f);
            this.f.animate().setStartDelay(500).setDuration(300).alpha(1.0f);
            this.j = true;
        }
        this.h.a((rqs) new alde(latLng));
    }

    public final void a(CharSequence charSequence) {
        this.d.setText(charSequence);
        this.d.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    public final void a(boolean z) {
        this.c.setVisibility(!z ? 8 : 0);
    }
}

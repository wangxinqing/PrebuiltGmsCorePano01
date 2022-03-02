package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: dyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dyc extends DialogFragment {
    public View.OnClickListener a;
    private ImageView b;
    private Bitmap c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2132018383);
        if (getArguments() != null) {
            this.c = (Bitmap) getArguments().getParcelable("image");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.appinvite_image_preview, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image_full_view);
        this.b = imageView;
        imageView.setImageBitmap(this.c);
        this.b.setContentDescription(getString(R.string.appinvite_image_preview));
        View.OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            this.b.setOnClickListener(onClickListener);
        }
        return inflate;
    }
}

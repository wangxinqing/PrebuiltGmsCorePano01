package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: akec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akec extends Fragment implements akef {
    public final akdv a = new akdv(this);

    public static akec a(String str, String str2) {
        akec akec = new akec();
        akec.setArguments(akdv.a(str, (String) null, str2, (Uri) null, 0));
        return akec;
    }

    public final void onAttach(Activity activity) {
        this.a.b = activity;
        super.onAttach(activity);
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        akdv akdv = this.a;
        if (bundle == null) {
            bundle2 = akdv.a.getArguments();
        } else {
            bundle2 = bundle;
        }
        if (akdv.d == null) {
            akdv.d = bundle2.getString("title");
        }
        if (akdv.e == null) {
            akdv.e = bundle2.getString("breadcrumb");
        }
        if (akdv.f == null) {
            akdv.f = bundle2.getString("description");
        }
        if (akdv.g == 0) {
            akdv.g = bundle2.getInt("iconResourceId", 0);
        }
        if (akdv.h == null) {
            akdv.h = (Uri) bundle2.getParcelable("iconUri");
        }
        if (akdv.i == null) {
            akdv.i = (Bitmap) bundle2.getParcelable("iconBitmap");
        }
        if (akdv.j == 0) {
            akdv.j = bundle2.getInt("iconBackground", 0);
        }
        if (akdv.k == 0) {
            akdv.k = bundle2.getInt("iconPadding", 0);
        }
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akdv akdv = this.a;
        View inflate = layoutInflater.inflate(R.layout.content_fragment, viewGroup, false);
        akdv.a(inflate, R.id.title, akdv.d);
        akdv.a(inflate, R.id.breadcrumb, akdv.e);
        akdv.a(inflate, R.id.description, akdv.f);
        int i = akdv.g;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        int i2 = akdv.j;
        if (i2 != 0) {
            imageView.setBackgroundColor(i2);
        }
        int i3 = akdv.k;
        imageView.setPadding(i3, i3, i3, i3);
        if (i != 0) {
            imageView.setImageResource(i);
            akdv.a(imageView, inflate);
            akdv.a(imageView);
        } else {
            Bitmap bitmap = akdv.i;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                akdv.a(imageView, inflate);
                akdv.a(imageView);
            } else {
                Uri uri = akdv.h;
                if (uri != null) {
                    imageView.setVisibility(4);
                    Activity activity = akdv.b;
                    if (activity != null) {
                        akfj a2 = akfj.a((Context) activity);
                        akdv.c = new akdu(akdv, imageView, inflate);
                        akfk akfk = new akfk(akdv.b);
                        akfk.a = uri;
                        akfk.a(imageView.getLayoutParams().width);
                        a2.a(akfk.a(), akdv.c);
                    }
                } else {
                    imageView.setVisibility(8);
                }
            }
        }
        return inflate;
    }

    public final void onDestroyView() {
        akdv akdv = this.a;
        Activity activity = akdv.b;
        if (!(activity == null || akdv.c == null)) {
            akfj.a((Context) activity).a((Object) akdv.c);
        }
        super.onDestroyView();
    }

    public final void onDetach() {
        this.a.b = null;
        super.onDetach();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        akdv akdv = this.a;
        bundle.putString("title", akdv.d);
        bundle.putString("breadcrumb", akdv.e);
        bundle.putString("description", akdv.f);
        bundle.putInt("iconResourceId", akdv.g);
        bundle.putParcelable("iconUri", akdv.h);
        bundle.putParcelable("iconBitmap", akdv.i);
        bundle.putInt("iconBackground", akdv.j);
        bundle.putInt("iconPadding", akdv.k);
        super.onSaveInstanceState(bundle);
    }
}

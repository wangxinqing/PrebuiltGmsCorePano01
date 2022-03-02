package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.ui.DeviceListItemView;
import com.google.android.setupdesign.items.Item;

/* renamed from: aclx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aclx extends Item {
    public final D2DDevice a;

    public aclx(Context context, D2DDevice d2DDevice) {
        String str;
        int i;
        iva.a((Object) d2DDevice);
        this.a = d2DDevice;
        if (d2DDevice != null) {
            str = d2DDevice.c;
        } else {
            str = null;
        }
        this.e = str;
        b();
        if (azlf.h()) {
            a(kf.a(context, (int) R.drawable.quantum_gm_ic_phone_android_gm_blue_36));
        } else {
            a(kf.a(context, (int) R.drawable.quantum_ic_phone_android_grey600_24));
        }
        if (!azlf.h()) {
            i = R.layout.sud_items_default;
        } else {
            i = R.layout.smartdevice_device_list_item_padded;
        }
        this.d = i;
        b();
    }

    public final void a(View view) {
        String str;
        if (azlf.h()) {
            DeviceListItemView deviceListItemView = (DeviceListItemView) view.findViewById(R.id.device_item);
            CharSequence charSequence = this.e;
            if (charSequence == null) {
                str = "";
            } else {
                str = charSequence.toString();
            }
            deviceListItemView.a(str);
            Drawable drawable = this.c;
            if (drawable != null) {
                if (!deviceListItemView.i) {
                    ImageView imageView = deviceListItemView.g;
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                    }
                } else {
                    ry.a(deviceListItemView.h, drawable, (Drawable) null);
                }
            }
        } else {
            super.a(view);
        }
        view.setId(this.b);
    }
}

package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: abxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface abxh extends IInterface {
    void a(abxe abxe);

    void a(abxe abxe, abxk abxk);

    void a(abxe abxe, Bundle bundle);

    void a(abxe abxe, BootstrapConfigurations bootstrapConfigurations);

    void a(abxe abxe, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu);

    void a(abxe abxe, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, abwy abwy);

    void a(abxe abxe, D2DDevice d2DDevice, String str, abxb abxb);

    void a(abxe abxe, String str);

    void a(acgz acgz);

    void a(acgz acgz, HandshakeData handshakeData);

    void a(ConnectParams connectParams);

    void b(abxe abxe);

    void b(abxe abxe, Bundle bundle);

    void b(acgz acgz, HandshakeData handshakeData);

    void c(abxe abxe);

    void d(abxe abxe);
}

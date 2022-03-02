package defpackage;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: abxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface abxt extends IInterface {
    String a(BootstrapOptions bootstrapOptions);

    void a(abxq abxq);

    void a(abxq abxq, abxn abxn);

    void a(abxq abxq, BootstrapOptions bootstrapOptions, abxn abxn);

    void a(abxq abxq, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu);

    void a(acgz acgz);

    void a(acgz acgz, HandshakeData handshakeData);

    void b(abxq abxq);

    void b(acgz acgz);

    void b(acgz acgz, HandshakeData handshakeData);

    void c(abxq abxq);

    void d(abxq abxq);

    void e(abxq abxq);

    void f(abxq abxq);
}

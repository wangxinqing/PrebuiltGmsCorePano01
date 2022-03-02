package defpackage;

import android.os.Parcel;
import com.google.android.chimera.Service;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import org.chromium.net.UrlRequest;

/* renamed from: ojp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ojp extends bhw implements ojq {
    public ojp() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void b() {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public final void d() {
        throw new UnsupportedOperationException();
    }

    public final void e() {
        throw new UnsupportedOperationException();
    }

    public final void f() {
        throw new UnsupportedOperationException();
    }

    public final void g() {
        throw new UnsupportedOperationException();
    }

    public final void h() {
        throw new UnsupportedOperationException();
    }

    public final void a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void b(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final void c(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public void a(GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }

    public final void a(InProductHelp inProductHelp) {
        throw new UnsupportedOperationException();
    }

    public final void a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((GoogleHelp) bhx.a(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                TogglingData togglingData = (TogglingData) bhx.a(parcel, TogglingData.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                a();
                return true;
            case 8:
                b();
                return true;
            case 9:
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                c();
                parcel2.writeNoException();
                return true;
            case 11:
                d();
                parcel2.writeNoException();
                return true;
            case 12:
                e();
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                a(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                f();
                parcel2.writeNoException();
                return true;
            case Service.START_CONTINUATION_MASK:
                b(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 16:
                g();
                parcel2.writeNoException();
                return true;
            case 17:
                a((InProductHelp) bhx.a(parcel, InProductHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                c(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 19:
                h();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

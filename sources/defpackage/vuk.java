package defpackage;

import android.content.Context;
import android.util.ArraySet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.Contact;
import java.util.Set;

/* renamed from: vuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vuk extends cv {
    private static final vj h = new vj();
    public boolean e = true;
    public final Set f = new ArraySet();
    public final vug g;
    private final Context i;

    public vuk(Context context, vug vug) {
        super(h);
        this.i = context;
        this.g = vug;
    }

    public final long J(int i2) {
        return (long) i2;
    }

    public final void b(boolean z) {
        if (this.e != z) {
            this.e = z;
            as();
        }
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i2) {
        return new vuj(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sharing_list_item_contact, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i2) {
        Object obj;
        vuj vuj = (vuj) adl;
        bx bxVar = this.a;
        ct ctVar = bxVar.f;
        if (ctVar == null) {
            ct ctVar2 = bxVar.g;
            if (ctVar2 != null) {
                obj = ctVar2.get(i2);
            } else {
                throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
            }
        } else {
            ctVar.b(i2);
            obj = bxVar.f.get(i2);
        }
        Contact contact = (Contact) obj;
        if (contact != null) {
            vuj.a(this.i, contact);
            vuj.a.setOnClickListener(new vuf(this, vuj, contact));
        }
    }

    public final boolean a(Contact contact) {
        return this.f.contains(Long.valueOf(contact.a));
    }
}

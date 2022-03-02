package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: ahy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahy extends ahx {
    protected int[] a;
    protected final int[] j;
    final String[] k;
    private final int l = -1;

    public ahy(Context context, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, cursor);
        this.j = iArr;
        this.k = strArr;
        a(cursor, strArr);
    }

    private final void a(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.a;
            if (iArr == null || iArr.length != length) {
                this.a = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.a[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.a = null;
    }

    public final CharSequence b(Cursor cursor) {
        if (this.l >= 0) {
            return cursor.getString(0);
        }
        return super.b(cursor);
    }

    public final Cursor c(Cursor cursor) {
        a(cursor, this.k);
        return super.c(cursor);
    }

    public final void a(View view, Context context, Cursor cursor) {
        int[] iArr = this.j;
        int length = iArr.length;
        int[] iArr2 = this.a;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                String string = cursor.getString(iArr2[i]);
                if (string == null) {
                    string = "";
                }
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(string);
                } else if (findViewById instanceof ImageView) {
                    ImageView imageView = (ImageView) findViewById;
                    try {
                        imageView.setImageResource(Integer.parseInt(string));
                    } catch (NumberFormatException e) {
                        imageView.setImageURI(Uri.parse(string));
                    }
                } else {
                    throw new IllegalStateException(findViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                }
            }
        }
    }
}

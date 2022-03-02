package defpackage;

import com.google.android.gms.appdatasearch.SuggestionResults;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dui implements Iterator {
    final /* synthetic */ SuggestionResults a;
    private int b = 0;

    public dui(SuggestionResults suggestionResults) {
        this.a = suggestionResults;
    }

    public final boolean hasNext() {
        return this.b < this.a.b.length;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.b++;
            return new duh();
        }
        throw new NoSuchElementException();
    }
}

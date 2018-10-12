package google.co.id.kotlinactivity

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

/**
 * Created by pertadima on 12,October,2018
 */

class Buku(val merk: String, val ukuran: Double) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readDouble()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(merk)
        parcel.writeDouble(ukuran)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Buku> {
        override fun createFromParcel(parcel: Parcel): Buku {
            return Buku(parcel)
        }

        override fun newArray(size: Int): Array<Buku?> {
            return arrayOfNulls(size)
        }
    }
}
package com.github.gvolpe.sbtb2018.http

import domain._

object algebra {

  trait UserAlg[F[_]] {
    def find(username: String): F[Option[User]]
    def save(user: User): F[Unit]
    def updateAge(username: String, age: Int): F[Unit]
  }

}

package io.github.nkacc.mvnp.hogwartsartifactsonline.system.response;

public class Result {

    private boolean flag; // Success status
    private Integer code; // Status Code
    private String message; // Success/Error Message
    private Object data; // Payload response

    public Result() {
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    } // response without Payload (for Failure)

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    } // response with Payload (for Success)

}


/*
Sample Result :
{
  "flag": true,
  "code": 200,
  "message": "Find One Success",
  "data": {
    "id": "1250808601744904192",
    "name": "Invisibility Cloak",
    "description": "An invisibility cloak is used to make the wearer invisible.",
    "imageUrl": "ImageUrl",
    "owner": {
      "id": 2,
      "name": "Harry Potter",
      "numberOfArtifacts": 2
    }
  }
}
*/

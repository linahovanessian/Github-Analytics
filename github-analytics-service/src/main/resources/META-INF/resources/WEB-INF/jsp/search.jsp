<!DOCTYPE html>

<html lang="en">
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</head>
<body>
<form name="form" class="example" action="/github/repositories">
    <div class="container" style="alignment: center">
        <div class="row">
            <div class="col-md-6">
                <img src="/images/githubIcon.png"/>
                <h2>Search for a Github repository:</h2>
                <div id="custom-search-input">
                    <div class="input-group col-md-12">
                        <input required="required" type="text"
                               class="form-control input-lg"
                               placeholder="Search.."
                               id="query"
                               name="query"/>
                        <span class="input-group-btn">
                        <button class="btn btn-info btn-lg" type="submit" name="btn">
                            <i class="glyphicon glyphicon-search"></i>
                        </button>
                    </span>
                    </div>
                </div>
            </div>
        </div>
    </div>

</form>


</body>

</html>

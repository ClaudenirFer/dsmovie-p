import FormCard from "components/FormCard/FormCard";
import { useParams } from "react-router-dom";
// import { Movie } from "types/movies";



function Form( ) {
  const params = useParams()

  return (
    <FormCard movieId={`${params.movieId}`} />
  );
}

export default Form;
